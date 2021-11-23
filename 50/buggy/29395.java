public boolean contains(final java.lang.String word) {
    if ((word.length()) == 1) {
        return true;
    }
    return word.contains(word.replace('\u2019', '\'').toLowerCase(java.util.Locale.ENGLISH));
}