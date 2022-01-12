public java.util.List<java.lang.String> applyPatternMatching(java.util.List<java.lang.String> possibleWords, java.lang.String constraintPattern) {
    char[] constraintPatternArray = constraintPattern.toCharArray();
    java.util.List<java.lang.String> patternMatchedWords = new java.util.ArrayList<java.lang.String>();
    java.lang.String pattern = regexPattern(constraintPattern);
    for (java.lang.String word : possibleWords) {
        if (isMatching(word, pattern)) {
            patternMatchedWords.add(word);
        }
    }
    return patternMatchedWords;
}