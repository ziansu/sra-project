private int readChoice(int maxValue) {
    int selectedNumber;
    while (true) {
        java.lang.String input = new java.util.Scanner(java.lang.System.in).nextLine();
        try {
            selectedNumber = java.lang.Integer.parseInt(input);
            if ((selectedNumber <= maxValue) && (selectedNumber >= 0))
                break;
            
            writeProblemMessage("Number is incorrect!");
        } catch (java.lang.NumberFormatException e) {
            writeProblemMessage("It is not a number!");
        }
    } 
    return selectedNumber;
}