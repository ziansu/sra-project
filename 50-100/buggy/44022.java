@java.lang.Override
public java.util.Set<java.lang.String> getRequiredWords() {
    java.lang.String requiredWords = requiredWordsInput.getText();
    java.lang.String[] requiredWordsList = requiredWords.split("\n");
    java.util.Set<java.lang.String> requiredWordsSet = new java.util.HashSet<>();
    for (java.lang.String word : requiredWordsList) {
        requiredWordsSet.add(word);
    }
    return requiredWordsSet;
}