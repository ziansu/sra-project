private boolean isPrePreviousLineEmpty(com.puppycrawl.tools.checkstyle.api.DetailAST token) {
    boolean result = false;
    final int lineNo = token.getLineNo();
    final int number = 3;
    if (lineNo >= number) {
        final java.lang.String prePreviousLine = getLines()[(lineNo - number)];
        result = prePreviousLine.trim().isEmpty();
    }
    return result;
}