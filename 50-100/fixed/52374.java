@java.lang.Override
public java.lang.Object visit(bantam.visitor.UnaryIncrExpr node) {
    super.visit(node);
    if (!(this.INT.equals(node.getExpr().getExprType())))
        this.registerError(node, ("UnaryIncrExpr must be of type int, is of type " + (node.getExpr().getExprType())));
    
    node.setExprType(this.INT);
    return true;
}