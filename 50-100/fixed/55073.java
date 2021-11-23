private boolean shouldCheck(final com.puppycrawl.tools.checkstyle.api.DetailAST ast, final com.puppycrawl.tools.checkstyle.api.Scope nodeScope) {
    final com.puppycrawl.tools.checkstyle.api.Scope surroundingScope = com.puppycrawl.tools.checkstyle.utils.ScopeUtils.getSurroundingScope(ast);
    return ((nodeScope.isIn(scope)) && (surroundingScope.isIn(scope))) && (((excludeScope) == null) || ((nodeScope != (excludeScope)) && (surroundingScope != (excludeScope))));
}