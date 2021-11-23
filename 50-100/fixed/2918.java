private boolean skipWord(java.lang.String word, java.util.List<java.lang.String> stoplist) {
    return (((word.equals(".")) || (word.equals(","))) || (word.contains(" "))) || (stoplist.contains(word));
}