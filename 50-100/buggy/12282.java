public int takeNumberFromUser(int width, int height) {
    java.lang.String userInput = java.lang.Integer.toString(takeNumberFromUser(3));
    try {
        if (((java.lang.Integer.parseInt(userInput)) > width) || ((java.lang.Integer.parseInt(userInput)) > height))
            throw new java.lang.IllegalArgumentException();
        
        return java.lang.Integer.parseInt(userInput);
    } catch (java.lang.IllegalArgumentException iae) {
        out.writeOut(((("printWrongSequenceHeightWidth" + width) + "x") + height));
        return takeNumberFromUser(width, height);
    }
}