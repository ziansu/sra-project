private java.lang.String finalGuessGenerator(java.util.List<java.lang.String> array, int numberOfWords, int highestOrderEnd) {
    java.lang.String finalGuess = "";
    for (int n = 1; n <= (numberOfWords - 1); n++) {
        finalGuess = finalGuess + (array.get(((array.size()) - 1)));
    }
    finalGuess = (array.get(highestOrderEnd)) + finalGuess;
    return finalGuess;
}