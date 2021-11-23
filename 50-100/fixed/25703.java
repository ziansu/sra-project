private boolean isSingleIncrement(com.puppycrawl.tools.checkstyle.api.DetailAST postExpr, java.lang.String var) {
    if ((postExpr.getChildCount()) != 1) {
        return false;
    }
    com.puppycrawl.tools.checkstyle.api.DetailAST expr = postExpr.getFirstChild().getFirstChild().getFirstChild();
    return (((expr.getType()) == (com.puppycrawl.tools.checkstyle.api.TokenTypes.INC)) || ((expr.getType()) == (com.puppycrawl.tools.checkstyle.api.TokenTypes.POST_INC))) && (expr.getFirstChild().getText().equals(var));
}