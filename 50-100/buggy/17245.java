protected final void checkRParen(com.puppycrawl.tools.checkstyle.api.DetailAST lparen, com.puppycrawl.tools.checkstyle.api.DetailAST rparen) {
    if (rparen == null) {
        return ;
    }
    final int rparenLevel = expandedTabsColumnNo(rparen);
    if ((getLevel().isAcceptable(rparenLevel)) || (!(startsLine(rparen)))) {
        return ;
    }
    final int lparenLevel = expandedTabsColumnNo(lparen);
    if (rparenLevel == (lparenLevel + 1)) {
        return ;
    }
    logError(rparen, "rparen", rparenLevel);
}