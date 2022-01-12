@java.lang.Override
public java.lang.Object visitExprStmt(kalang.ast.ExprStmt node) {
    visitChildren(node);
    if (!((node.getExpr()) instanceof kalang.ast.AssignExpr)) {
        if (((node.getExpr().getType()) != null) && (!(Types.VOID_TYPE.equals(node.getExpr().getType())))) {
            pop(node.getExpr().getType());
        }
    }
    return null;
}