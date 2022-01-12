private boolean isSameNameMethod(com.puppycrawl.tools.checkstyle.api.DetailAST ast) {
    antlr.collections.AST sibling = ast.getNextSibling();
    if ((sibling != null) && ((sibling.getType()) == (com.puppycrawl.tools.checkstyle.api.TokenTypes.TYPE_ARGUMENTS))) {
        sibling = sibling.getNextSibling();
    }
    if ((sibling == null) || ((sibling.getType()) != (com.puppycrawl.tools.checkstyle.api.TokenTypes.IDENT))) {
        return true;
    }
    final java.lang.String name = sibling.getText();
    return !(getMethodName().equals(name));
}