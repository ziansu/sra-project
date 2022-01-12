public lir.LirReturnInfo visit(lir.AssignStmt stmt, lir.Environment d) {
    lir.LirReturnInfo valueInfo = stmt.getRhs().accept(this, d);
    lir.LirReturnInfo locationInfo = stmt.getLocation().accept(this, d);
    lirAssignHandler(locationInfo, valueInfo, d);
    return null;
}