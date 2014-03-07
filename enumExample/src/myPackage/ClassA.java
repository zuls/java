package myPackage;
public class ClassA {
	enum week{
		Sun, Mon, tue, wed, thu, fri
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		week x = week.Mon;
		
		switch(x){
		case Sun:
			System.out.println("Sunday");
			break;
		case Mon:
			System.out.println("Monday");
			break;
		case tue:
			System.out.println("Tuesday");
			break;
		case wed:
			System.out.println("Wednesday");
			break;
		case thu:
			System.out.println("Thursday");
			break;
		case fri:
			System.out.println("Friday");
			break;
		default:
			System.out.println("weekend");
		}
	}

}
