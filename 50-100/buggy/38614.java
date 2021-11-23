@java.lang.Override
protected void checkRCurly() {
    final com.puppycrawl.tools.checkstyle.api.DetailAST rcurly = getRCurly();
    final int rcurlyPos = expandedTabsColumnNo(rcurly);
    final com.puppycrawl.tools.checkstyle.checks.indentation.IndentLevel level = curlyIndent();
    level.addAcceptedIndent(((level.getFirstIndentLevel()) + (getLineWrappingIndentation())));
    if ((!(level.isAcceptable(rcurlyPos))) && (isOnStartOfLine(rcurly))) {
        logError(rcurly, "rcurly", rcurlyPos, curlyIndent());
    }
}