private int getPrepositionIndex(java.lang.String inputLine, int prepositionIndex) {
    for (int i = 0; i < (parser.JListeeParser.DATE_WORDS.length); i++) {
        int temp = 0;
        java.util.regex.Matcher matcher = java.util.regex.Pattern.compile((("\\b" + (parser.JListeeParser.DATE_WORDS[i])) + "\\b")).matcher(inputLine);
        while (matcher.find()) {
            temp = matcher.start();
        } 
        if (prepositionIndex < temp) {
            prepositionIndex = temp;
        }
    }
    return prepositionIndex;
}