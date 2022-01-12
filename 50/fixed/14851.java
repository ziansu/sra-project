private void visitSemi(com.puppycrawl.tools.checkstyle.api.DetailAST ast) {
    lastStatementEnd = ast.getLineNo();
}