@java.lang.Override
public java.lang.Object visit(bantam.visitor.NewExpr node) {
    if (!(this.getClassMap().containsKey(node.getType()))) {
        this.registerError(node, (("Object type " + (node.getType())) + " does not exist."));
    }
    node.setExprType(node.getType());
    return super.visit(node);
}