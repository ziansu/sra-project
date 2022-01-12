public boolean isStmtLeftPara(ast.AssignStmt a) {
    if ((a.getLHS()) instanceof ast.ParameterizedExpr)
        return true;
    
    return false;
}