private boolean isExtendedClassNamedAsException(com.puppycrawl.tools.checkstyle.api.DetailAST ast) {
    final com.puppycrawl.tools.checkstyle.api.DetailAST extendsClause = ast.findFirstToken(TokenTypes.EXTENDS_CLAUSE);
    if (extendsClause != null) {
        com.puppycrawl.tools.checkstyle.api.DetailAST currentNode = extendsClause;
        while ((currentNode.getType()) != (com.puppycrawl.tools.checkstyle.api.TokenTypes.IDENT)) {
            currentNode = currentNode.getLastChild();
        } 
        final java.lang.String extendedClassName = currentNode.getText();
        return extendedClassName.matches(extendedClassNameFormat);
    }
    return false;
}