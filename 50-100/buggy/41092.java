private boolean isForRange(ast.AssignStmt a) {
    if ((a.getRHS()) instanceof ast.RangeExpr) {
        ast.ASTNode parent = a.getParent();
        if ((parent != null) && (parent instanceof ast.ForStmt))
            return true;
        
    }
    return false;
}