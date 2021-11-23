private java.util.List<java.lang.String> getCorrectlySizedWords(java.util.List<java.lang.String> words, int correctSize) {
    if (correctSize == (-1)) {
        return words;
    }
    java.util.List<java.lang.String> correctlySizedWords = new java.util.ArrayList<>();
    for (java.lang.String word : words) {
        if ((word.length()) == correctSize) {
            correctlySizedWords.add(word);
        }
    }
    return correctlySizedWords;
}