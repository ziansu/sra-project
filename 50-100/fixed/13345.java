@java.lang.Override
public int subMenu() {
    java.lang.System.out.println("-----Operations for library director menu-----");
    java.lang.System.out.println("What kinds of operation would you like to perform?");
    java.lang.System.out.println("1. List all un-returned book copies which are checked-out within a period");
    java.lang.System.out.println("2. Return to the main menu");
    java.lang.System.out.print("Enter Your Choice: ");
    java.util.Scanner scanner = new java.util.Scanner(java.lang.System.in);
    int choice = scanner.nextInt();
    if (choice == 2)
        return -1;
    
    return choice;
}