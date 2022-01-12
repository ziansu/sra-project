public int getInputNumber() {
    java.lang.Boolean validInput = false;
    java.util.Scanner in = new java.util.Scanner(java.lang.System.in);
    java.lang.System.out.print(" please choose a box (1-9): ");
    while (!validInput) {
        if (in.hasNextInt()) {
            int input = in.nextInt();
            if ((input <= 9) && (input >= 1)) {
                validInput = true;
                return input;
            }else {
                java.lang.System.out.println("Please enter a number between 1-9!");
            }
        }else {
            java.lang.System.out.println("Please enter a number between 1-9!");
        }
    } 
    return 0;
}