@java.lang.Override
public java.lang.Object visit(bantam.visitor.NewArrayExpr node) {
    super.visit(node);
    if (!(node.getSize().getExprType().equals(bantam.visitor.INT))) {
        this.registerError(node, "Expression determining size of array does not resolve to int.");
    }
    return super.visit(node);
}