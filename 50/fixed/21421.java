private boolean checkFor(checks.DetailAST a) {
    forAST = null;
    if (a.branchContains(TokenTypes.LITERAL_FOR)) {
        dfs(a, TokenTypes.LITERAL_FOR, 2);
        return (forAST) != null;
    }
    return false;
}