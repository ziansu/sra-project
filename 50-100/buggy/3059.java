private void processIdent(com.puppycrawl.tools.checkstyle.api.DetailAST ast) {
    final int parentType = ast.getParent().getType();
    switch (parentType) {
        case com.puppycrawl.tools.checkstyle.api.TokenTypes.ANNOTATION_MEMBER_VALUE_PAIR :
        case com.puppycrawl.tools.checkstyle.api.TokenTypes.ANNOTATION :
        case com.puppycrawl.tools.checkstyle.api.TokenTypes.ANNOTATION_FIELD_DEF :
            break;
        case com.puppycrawl.tools.checkstyle.api.TokenTypes.METHOD_CALL :
            if ((checkMethods) && (isClassMethod(ast.getText()))) {
                log(ast, com.puppycrawl.tools.checkstyle.checks.coding.RequireThisCheck.MSG_METHOD, ast.getText());
            }
            break;
        default :
            if (checkFields) {
                processField(ast, parentType);
            }
            break;
    }
}