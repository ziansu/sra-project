@java.lang.Override
public java.lang.Object visit(bantam.visitor.UnaryNotExpr node) {
    super.visit(node);
    if (this.BOOLEAN.equals(node.getExpr().getExprType()))
        this.registerError(node, ("UnaryNotExpr must be of type boolean, is of type " + (node.getExpr().getExprType())));
    
    node.setExprType(this.BOOLEAN);
    return false;
}