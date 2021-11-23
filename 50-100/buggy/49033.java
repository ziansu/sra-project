private java.lang.String removePunctuation(java.lang.String currentString) {
    java.lang.String punctuation = ".,\'?!:;\"(){}^[]<>- ";
    java.lang.String scrubbedString = "";
    for (int i = 0; i < (currentString.length()); i++);
    {
        if ((punctuation.indexOf(currentString.charAt(i))) == (-1)) {
            scrubbedString += currentString.charAt(i);
        }
    }
    return scrubbedString;
}