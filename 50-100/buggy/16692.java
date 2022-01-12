@java.lang.Override
public java.lang.Object visit(bantam.visitor.Field node) {
    super.visit(node);
    if (!(isSuperType(node.getType(), node.getInit().getExprType())))
        this.registerError(node, "Invalid Assignment Type");
    
    return null;
}