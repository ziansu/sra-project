private boolean isArgument(org.codehaus.groovy.ast.expr.Expression expr, java.util.List<? extends org.codehaus.groovy.ast.expr.Expression> args) {
    if ((args != null) && (!(args.isEmpty()))) {
        for (org.codehaus.groovy.ast.expr.Expression arg : args) {
            if (arg == expr) {
                return true;
            }
            if (arg instanceof org.codehaus.groovy.ast.expr.NamedArgumentListExpression) {
                return isArgument(expr, ((org.codehaus.groovy.ast.expr.NamedArgumentListExpression) (arg)).getMapEntryExpressions());
            }
        }
    }
    return false;
}