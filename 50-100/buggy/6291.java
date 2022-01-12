private matjuice.codegen.Stmt genAssignLiteralStmt(matjuice.codegen.TIRAssignLiteralStmt tirStmt) {
    java.util.Map<java.lang.String, matjuice.analysis.ConstInfo> map = constMap.get(tirStmt);
    java.lang.String lhs = matjuice.codegen.Generator.getSingleLhs(tirStmt);
    if ((map.containsKey(lhs)) && (map.get(lhs).isConst())) {
        locals.remove(lhs);
        return new matjuice.codegen.StmtNull();
    }
    return new matjuice.codegen.StmtAssign(lhs, genExpr(tirStmt.getRHS()));
}