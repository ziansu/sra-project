private int thePoints(java.lang.String theString) {
    int score = 0;
    java.lang.String delims = "";
    java.lang.String[] charArray = theString.split(delims);
    for (int i = 1; i < (theString.length()); i++) {
        java.lang.String thePointChar = charArray[i];
        score = score + (valueOfCharacter(thePointChar));
    }
    return score;
}