public static int readNegativeIntFromUser(java.util.Scanner keyboard) {
    if (keyboard == null) {
        keyboard = new java.util.Scanner(java.lang.System.in);
    }
    int inputInt = 1;
    while (inputInt >= 0) {
        try {
            inputInt = keyboard.nextInt();
            if (inputInt >= 0)
                java.lang.System.out.println(("Please input a negative integer " + "less than zero."));
            
        } catch (java.util.InputMismatchException ime) {
            keyboard.next();
            java.lang.System.out.println("Error: please input an integer.");
        }
    } 
    if (keyboard != null) {
        keyboard.close();
    }
    return inputInt;
}