private void validateCatch(com.google.javascript.rhino.Node n) {
    validateNodeType(Token.CATCH, n);
    validateChildCount(n);
    com.google.javascript.rhino.Node caught = n.getFirstChild();
    if (caught.isName()) {
        validateName(caught);
    }else
        if (n.isArrayPattern()) {
            validateArrayPattern(Token.CATCH, caught);
        }else {
            validateObjectPattern(Token.CATCH, caught);
        }
    
    validateBlock(n.getLastChild());
}