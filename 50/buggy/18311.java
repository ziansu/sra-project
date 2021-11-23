@java.lang.Override
public java.lang.Object visit(bantam.visitor.ConstStringExpr node) {
    super.visit(node);
    node.setExprType("String");
    return null;
}