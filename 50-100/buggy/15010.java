private boolean isSingleDef(java.util.ArrayList<ast.AssignStmt> def, ast.AssignStmt def0) {
    int cnt = 0;
    java.lang.String targ = def0.getLHS().getVarName();
    for (ast.AssignStmt a : def) {
        if (a.getLHS().getVarName().equals(targ)) {
            cnt++;
        }
    }
    return cnt == 1;
}