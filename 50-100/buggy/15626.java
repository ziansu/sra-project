public boolean isProduct(org.geogebra.common.kernel.arithmetic.ExpressionValue ev) {
    if ((ev == null) || (!(ev.isExpressionNode()))) {
        return false;
    }else {
        return (((org.geogebra.common.kernel.arithmetic.ExpressionNode) (ev)).getOperation()) == (org.geogebra.common.plugin.Operation.MULTIPLY);
    }
}