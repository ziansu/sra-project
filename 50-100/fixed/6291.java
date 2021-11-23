private matjuice.codegen.Stmt genAssignLiteralStmt(matjuice.codegen.TIRAssignLiteralStmt tirStmt) {
    java.lang.String lhs = matjuice.codegen.Generator.getSingleLhs(tirStmt);
    if ((constMap.containsKey(lhs)) && (constMap.get(lhs).isConst())) {
        locals.remove(lhs);
        return new matjuice.codegen.StmtNull();
    }
    return new matjuice.codegen.StmtAssign(lhs, genExpr(tirStmt.getRHS()));
}