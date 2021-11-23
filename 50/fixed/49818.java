@java.lang.Override
public java.lang.Object visit(bantam.visitor.UnaryDecrExpr node) {
    super.visit(node);
    checkUnaryExpr(node);
    return true;
}