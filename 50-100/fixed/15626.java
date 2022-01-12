public boolean isProduct(org.geogebra.common.kernel.arithmetic.ExpressionValue ev) {
    if ((ev == null) || (!(ev.isExpressionNode()))) {
        return false;
    }
    return (((org.geogebra.common.kernel.arithmetic.ExpressionNode) (ev)).getOperation()) == (org.geogebra.common.plugin.Operation.MULTIPLY);
}