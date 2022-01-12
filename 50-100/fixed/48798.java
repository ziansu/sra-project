private boolean hasPrefixWithKeyword(java.lang.String keyword, int index, java.lang.String input) {
    if (index > ((keyword.length()) + 2)) {
        int startIndex = (index - (keyword.length())) - 3;
        if (input.substring(startIndex, (index - 1)).equals(((" " + keyword) + " "))) {
            return true;
        }
    }
    return false;
}