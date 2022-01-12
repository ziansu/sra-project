@java.lang.Override
public java.util.Set<java.lang.String> getRequiredWords() {
    java.lang.String requiredWords = requiredWordsInput.getText();
    java.util.Set<java.lang.String> requiredWordsSet = new java.util.HashSet<>();
    if ((requiredWords.length()) == 0) {
        return requiredWordsSet;
    }else {
        java.lang.String[] requiredWordsList = requiredWords.split("\n");
        for (java.lang.String word : requiredWordsList) {
            requiredWordsSet.add(word);
        }
        return requiredWordsSet;
    }
}