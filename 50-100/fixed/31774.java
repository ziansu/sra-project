private void checkIdent(com.puppycrawl.tools.checkstyle.api.DetailAST ast) {
    if (!(getCurrentVariables().isEmpty())) {
        final com.puppycrawl.tools.checkstyle.api.DetailAST identAST = ast.getFirstChild();
        if (((identAST != null) && ((identAST.getType()) == (com.puppycrawl.tools.checkstyle.api.TokenTypes.IDENT))) && (getCurrentVariables().contains(identAST.getText()))) {
            log(ast.getLineNo(), ast.getColumnNo(), com.puppycrawl.tools.checkstyle.checks.coding.ModifiedControlVariableCheck.MSG_KEY, identAST.getText());
        }
    }
}