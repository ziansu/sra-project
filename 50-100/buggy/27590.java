public static com.puppycrawl.tools.checkstyle.api.DetailAST annotatingWhat(com.puppycrawl.tools.checkstyle.api.DetailAST ast) {
    if (ast == null) {
        throw new java.lang.NullPointerException("the ast is null");
    }
    if ((ast.getType()) != (TokenTypes.ANNOTATION)) {
        throw new java.lang.IllegalArgumentException(("The ast is not an annotation. AST: " + ast));
    }
    return ast.getParent().getParent();
}