public static float readFloatFromUser(java.util.Scanner keyboard) {
    if (keyboard == null) {
        keyboard = new java.util.Scanner(java.lang.System.in);
    }
    float inputFloat = 0.0F;
    boolean checkInput = true;
    while (checkInput) {
        try {
            inputFloat = keyboard.nextFloat();
            checkInput = false;
        } catch (java.util.InputMismatchException ime) {
            keyboard.next();
            java.lang.System.out.println("Error: please input a valid floating value.");
        }
    } 
    return inputFloat;
}