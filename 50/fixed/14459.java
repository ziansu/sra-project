public void addFilters(org.odata4j.expression.BoolCommonExpression expr) {
    if (null == expr) {
        return ;
    }
    if (null == (oData4jExpression)) {
        oData4jExpression = expr;
    }else {
        oData4jExpression = org.odata4j.expression.Expression.and(oData4jExpression, expr);
    }
}