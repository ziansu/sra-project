protected final void checkRParen(com.puppycrawl.tools.checkstyle.api.DetailAST lparen, com.puppycrawl.tools.checkstyle.api.DetailAST rparen) {
    if (rparen != null) {
        final int rparenLevel = expandedTabsColumnNo(rparen);
        final int lparenLevel = expandedTabsColumnNo(lparen);
        if (((!(getLevel().isAcceptable(rparenLevel))) && (startsLine(rparen))) && (rparenLevel != (lparenLevel + 1))) {
            logError(rparen, "rparen", rparenLevel);
        }
    }
}