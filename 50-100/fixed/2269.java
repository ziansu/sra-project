public boolean containsWord(java.lang.String sentence, java.lang.String word) {
    boolean contains = (sentence.indexOf(word)) >= 0;
    int firstInstanceOfWord = -1;
    if (contains) {
        firstInstanceOfWord = firstInstance(sentence, word);
    }
    return firstInstanceOfWord >= 0;
}