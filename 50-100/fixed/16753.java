private int takeNumberFromUser(int minSize) {
    java.lang.String userInput = java.lang.Integer.toString(takeNumberFromUser());
    try {
        if ((java.lang.Integer.parseInt(userInput)) < minSize)
            throw new java.util.InputMismatchException();
        
        return java.lang.Integer.parseInt(userInput);
    } catch (java.util.InputMismatchException ime) {
        out.writeOut("printWrongSequence");
        java.lang.System.out.println(minSize);
        return takeNumberFromUser(minSize);
    }
}