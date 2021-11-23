private static com.puppycrawl.tools.checkstyle.api.DetailAST getWhitespaceFollowedNode(com.puppycrawl.tools.checkstyle.api.DetailAST ast) {
    final com.puppycrawl.tools.checkstyle.api.DetailAST whitespaceFollowedAst;
    switch (ast.getType()) {
        case com.puppycrawl.tools.checkstyle.api.TokenTypes.TYPECAST :
            whitespaceFollowedAst = ast.findFirstToken(TokenTypes.RPAREN);
            break;
        case com.puppycrawl.tools.checkstyle.api.TokenTypes.ARRAY_DECLARATOR :
            whitespaceFollowedAst = com.puppycrawl.tools.checkstyle.checks.whitespace.NoWhitespaceAfterCheck.getArrayDeclaratorPreviousElement(ast);
            break;
        case com.puppycrawl.tools.checkstyle.api.TokenTypes.INDEX_OP :
            final com.puppycrawl.tools.checkstyle.api.DetailAST resultAst = com.puppycrawl.tools.checkstyle.checks.whitespace.NoWhitespaceAfterCheck.getIndexOpPreviousElement(ast);
            if (resultAst == null) {
                whitespaceFollowedAst = ast;
            }else {
                whitespaceFollowedAst = resultAst;
            }
            break;
        default :
            whitespaceFollowedAst = ast;
    }
    return whitespaceFollowedAst;
}