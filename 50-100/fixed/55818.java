public static char readCharacterFromUser(java.util.Scanner keyboard) {
    if (keyboard == null) {
        keyboard = new java.util.Scanner(java.lang.System.in);
    }
    char inputChar = '0';
    boolean checkInput = true;
    while (checkInput) {
        try {
            inputChar = keyboard.next().charAt(0);
            checkInput = false;
        } catch (java.util.InputMismatchException ime) {
            keyboard.next();
            java.lang.System.out.println("Error: please input a valid char value.");
        }
    } 
    return inputChar;
}