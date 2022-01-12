public int countOperation(org.geogebra.common.kernel.arithmetic.ExpressionValue ev, org.geogebra.common.plugin.Operation op) {
    if ((ev != null) && (ev.isExpressionNode())) {
        org.geogebra.common.kernel.arithmetic.ExpressionNode en = ((org.geogebra.common.kernel.arithmetic.ExpressionNode) (ev));
        if ((en.getOperation()) == op) {
            return 1;
        }
        int found;
        found = countOperation(en.getLeft(), op);
        found = found + (countOperation(en.getRight(), op));
        return found;
    }
    return 0;
}