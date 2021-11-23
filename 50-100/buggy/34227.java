private boolean checkIf(final com.puppycrawl.tools.checkstyle.api.DetailAST ast, boolean useBreak, boolean useContinue) {
    final com.puppycrawl.tools.checkstyle.api.DetailAST thenStmt = ast.findFirstToken(TokenTypes.RPAREN).getNextSibling();
    final com.puppycrawl.tools.checkstyle.api.DetailAST elseStmt = thenStmt.getNextSibling();
    boolean isTerminated = isTerminated(thenStmt, useBreak, useContinue);
    if (isTerminated && (elseStmt != null)) {
        isTerminated = isTerminated(elseStmt.getFirstChild(), useBreak, useContinue);
    }
    return isTerminated;
}