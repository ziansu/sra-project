public java.util.List<java.lang.String> tokenize(java.lang.String sentence) {
    java.lang.String removedString = removeNonLetters(sentence);
    removedString = removedString.toLowerCase();
    java.lang.String[] toks = removedString.split("\\s+");
    for (java.lang.String word : toks) {
        if (!(stopWords.contains(word))) {
            tokens.add(word);
        }
    }
    return tokens;
}