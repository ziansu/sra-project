private boolean isPrePreviousLineEmpty(com.puppycrawl.tools.checkstyle.api.DetailAST token) {
    final int lineNo = token.getLineNo();
    final int number = 3;
    final java.lang.String prePreviousLine = getLines()[(lineNo - number)];
    return prePreviousLine.trim().isEmpty();
}