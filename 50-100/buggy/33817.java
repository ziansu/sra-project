private boolean checkIFLastBracketIsInNewLine(java.lang.StringBuilder tmpWikiText, int i) {
    if ((tmpWikiText.charAt((i - 1))) != '\n') {
        return true;
    }
    if (((tmpWikiText.charAt((i - 1))) != '\n') && ((tmpWikiText.charAt((i - 2))) != '\n')) {
        return true;
    }
    return false;
}