private boolean checkIFLastBracketIsInNewLine(java.lang.StringBuilder tmpWikiText, int i) {
    return ((tmpWikiText.charAt((i - 1))) != '\n') || (((tmpWikiText.charAt((i - 1))) != '\n') && ((tmpWikiText.charAt((i - 2))) != '\n'));
}