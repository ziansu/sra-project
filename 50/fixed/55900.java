public boolean isMember(java.lang.String word) {
    if (words.contains(word.toLowerCase())) {
        return true;
    }
    return false;
}