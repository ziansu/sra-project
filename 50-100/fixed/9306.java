public static void reverseStatement(java.lang.String userInput) {
    java.lang.String inputReversed;
    inputReversed = "";
    for (int i = (userInput.length()) - 1; i >= 0; i--) {
        inputReversed = inputReversed + (userInput.charAt(i));
    }
    java.lang.System.out.println(inputReversed);
}