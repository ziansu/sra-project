private java.util.Set<java.lang.String> getSimilarWords(java.lang.String inputWord) {
    java.util.Set<java.lang.String> vocabulary = this.cr.getVocabulary();
    java.util.Set<java.lang.String> similarWords = new java.util.HashSet<java.lang.String>();
    for (java.lang.String word : vocabulary) {
        if ((getDMDistance(inputWord, word)) <= 1) {
            similarWords.add(word);
        }
    }
    return similarWords;
}