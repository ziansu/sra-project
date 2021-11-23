protected void checkLCurly() {
    final com.puppycrawl.tools.checkstyle.api.DetailAST lcurly = getLCurly();
    final int lcurlyPos = expandedTabsColumnNo(lcurly);
    if ((curlyIndent().isAcceptable(lcurlyPos)) || (!(isOnStartOfLine(lcurly)))) {
        return ;
    }
    logError(lcurly, "lcurly", lcurlyPos, curlyIndent());
}