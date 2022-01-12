public int countOperation(org.geogebra.common.kernel.arithmetic.ExpressionValue ev, org.geogebra.common.plugin.Operation op) {
    if ((ev != null) && (ev.isExpressionNode())) {
        org.geogebra.common.kernel.arithmetic.ExpressionNode en = ((org.geogebra.common.kernel.arithmetic.ExpressionNode) (ev));
        int found = 0;
        if ((en.getOperation()) == op) {
            found++;
        }
        found += countOperation(en.getLeft(), op);
        found += countOperation(en.getRight(), op);
        return found;
    }
    return 0;
}