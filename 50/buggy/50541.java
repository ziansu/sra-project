public boolean search(java.lang.String word) {
    java.util.Arrays.fill(flag, false);
    java.lang.String matchedWord = "";
    searchMatch(root, word, matchedWord);
    return true;
}