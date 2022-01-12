public boolean search(java.lang.String word) {
    init();
    java.lang.String matchedWord = "";
    searchMatch(root, word, matchedWord);
    return true;
}