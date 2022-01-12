private boolean isSingleIncrement(com.puppycrawl.tools.checkstyle.api.DetailAST postExpr) {
    if ((postExpr.getChildCount()) != 1) {
        return false;
    }
    com.puppycrawl.tools.checkstyle.api.DetailAST expr = postExpr.getFirstChild().getFirstChild().getFirstChild();
    if (((expr.getType()) == (com.puppycrawl.tools.checkstyle.api.TokenTypes.INC)) || ((expr.getType()) == (com.puppycrawl.tools.checkstyle.api.TokenTypes.POST_INC))) {
        return true;
    }
    return false;
}