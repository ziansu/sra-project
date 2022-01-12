public static int isPositiveNumber(java.util.Scanner scan) {
    int number = 0;
    boolean valid = true;
    while (valid) {
        try {
            number = scan.nextInt();
            if ((number <= 1) || (number > 100)) {
                java.lang.System.out.println("Not a valid number. Please re-enter a number: ");
                continue;
            }else
                break;
            
        } catch (java.util.InputMismatchException e) {
            java.lang.System.out.println("Not a number. Please try again: ");
            scan.nextLine();
        }
    } 
    return number;
}