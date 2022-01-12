protected void checkLCurly() {
    final com.puppycrawl.tools.checkstyle.api.DetailAST lcurly = getLCurly();
    final int lcurlyPos = expandedTabsColumnNo(lcurly);
    if (((lcurly == null) || (curlyLevel().accept(lcurlyPos))) || (!(startsLine(lcurly)))) {
        return ;
    }
    logError(lcurly, "lcurly", lcurlyPos);
}