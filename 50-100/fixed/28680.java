private boolean loopBodyContainsDifficultExpr(com.puppycrawl.tools.checkstyle.api.DetailAST expr, java.lang.String array, java.lang.String var) {
    if (((expr.getType()) == (com.puppycrawl.tools.checkstyle.api.TokenTypes.IDENT)) && (expr.getText().equals(var))) {
        return isDifficultIdent(expr, array);
    }
    for (com.puppycrawl.tools.checkstyle.api.DetailAST child = expr.getFirstChild(); child != null; child = child.getNextSibling()) {
        if (loopBodyContainsDifficultExpr(child, array, var)) {
            return true;
        }
    }
    return false;
}