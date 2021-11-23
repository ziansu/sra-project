private static boolean isTooComplexToInline(java.util.List<com.google.gwt.dev.jjs.ast.JExpression> bodyAsExpressionList, boolean ignoringReturn) {
    if (ignoringReturn) {
        return (bodyAsExpressionList.size()) > 2;
    }
    if (((bodyAsExpressionList.size()) == 3) && (bodyAsExpressionList.get(2).hasSideEffects())) {
        return true;
    }
    return false;
}