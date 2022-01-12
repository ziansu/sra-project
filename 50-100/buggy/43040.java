public static int queryUserForInt(java.util.Scanner scanner, java.lang.String prompt) {
    int input = -1;
    java.lang.System.out.println(prompt);
    java.lang.String gridInput = scanner.nextLine();
    while (input == (-1)) {
        try {
            input = java.lang.Integer.parseInt(gridInput);
        } catch (java.lang.NumberFormatException e) {
            java.lang.System.out.println(("Cannot parse integer from input: " + gridInput));
        }
    } 
    return input;
}