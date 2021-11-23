private static boolean isTooComplexToInline(java.util.List<com.google.gwt.dev.jjs.ast.JExpression> bodyAsExpressionList, boolean ignoringReturn) {
    if ((bodyAsExpressionList.size()) > 3) {
        return true;
    }
    if (((bodyAsExpressionList.size()) == 3) && ((!ignoringReturn) || (bodyAsExpressionList.get(2).hasSideEffects()))) {
        return true;
    }
    return false;
}