public boolean isReplacable(ast.AssignStmt def, ast.AssignStmt use) {
    java.lang.String leftname = def.getLHS().getVarName();
    return getExprNamesPar(use).contains(leftname);
}