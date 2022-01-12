@io.transwarp.db_specific.DialectSpecific
private void replaceDepthWithNestedExpr() {
    if ((udfDepth) >= 1) {
        if (operands.isEmpty()) {
            operands.add(io.transwarp.generate.config.expr.ExprConfig.defaultNestedExpr(this, udfDepth));
        }
        udfDepth = io.transwarp.generate.config.expr.ExprConfig.HAS_NESTED_UDF_DEPTH;
    }
}