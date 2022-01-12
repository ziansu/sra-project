private boolean isSuperCall(com.puppycrawl.tools.checkstyle.api.DetailAST literalSuperAst) {
    boolean superCall = false;
    if ((literalSuperAst.getType()) == (com.puppycrawl.tools.checkstyle.api.TokenTypes.LITERAL_SUPER)) {
        final com.puppycrawl.tools.checkstyle.api.DetailAST dotAst = literalSuperAst.getParent();
        if ((!(isSameNameMethod(literalSuperAst))) && (!(com.puppycrawl.tools.checkstyle.checks.coding.AbstractSuperCheck.hasArguments(dotAst)))) {
            superCall = isSuperCallInOverridingMethod(dotAst);
        }
    }
    return superCall;
}