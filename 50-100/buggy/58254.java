private void visitMethodParameters(com.puppycrawl.tools.checkstyle.api.DetailAST ast) {
    com.puppycrawl.tools.checkstyle.api.DetailAST parameterDefAST = ast.findFirstToken(TokenTypes.PARAMETER_DEF);
    for (; parameterDefAST != null; parameterDefAST = parameterDefAST.getNextSibling()) {
        if ((parameterDefAST.getType()) == (com.puppycrawl.tools.checkstyle.api.TokenTypes.PARAMETER_DEF)) {
            final com.puppycrawl.tools.checkstyle.api.DetailAST param = parameterDefAST.findFirstToken(TokenTypes.IDENT);
            parameterNames.add(param.getText());
        }
    }
}