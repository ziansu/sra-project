public static double readDoubleFromUser(java.util.Scanner keyboard) {
    if (keyboard == null) {
        keyboard = new java.util.Scanner(java.lang.System.in);
    }
    double inputDouble = 0.0;
    boolean checkInput = true;
    while (checkInput) {
        try {
            inputDouble = keyboard.nextDouble();
            checkInput = false;
        } catch (java.util.InputMismatchException ime) {
            keyboard.next();
            java.lang.System.out.println("Error: please input a valid double value.");
        }
    } 
    return inputDouble;
}