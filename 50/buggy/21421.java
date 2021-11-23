private boolean checkFor(checks.DetailAST a) {
    forAST = null;
    if (a.branchContains(TokenTypes.LITERAL_FOR)) {
        java.lang.System.out.println("Found literal for in branch");
        dfs(a, TokenTypes.LITERAL_FOR, 2);
        return (forAST) != null;
    }
    return false;
}