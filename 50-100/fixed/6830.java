private static java.lang.String removeCommandWord(java.lang.String userInput) {
    java.lang.String[] inputArray = userInput.split(parser.EventParser.SYMBOL_WHITESPACE);
    java.lang.String remainingText = parser.EventParser.SYMBOL_EMPTY;
    if ((inputArray.length) >= (parser.EventParser.ARRAY_MINIMUM_LENGTH)) {
        for (int i = 1; i < (inputArray.length); i++) {
            remainingText += inputArray[i];
            remainingText += parser.EventParser.SYMBOL_WHITESPACE;
        }
    }
    return remainingText;
}