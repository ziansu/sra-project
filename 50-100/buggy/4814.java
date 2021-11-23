public void caseMJCopyStmt(matjuice.transformer.MJCopyStmt stmt) {
    inFlowSets.put(stmt, copy(currentInSet));
    currentOutSet = copy(currentInSet);
    java.lang.String lhs = stmt.getVarName();
    currentOutSet.remove(lhs);
    matjuice.analysis.MallocSite m = matjuice.analysis.MallocSite.newLocalSite();
    matjuice.analysis.PointsToValue ptv = new matjuice.analysis.PointsToValue();
    ptv.addMallocSite(m);
    ptv.addAliasingStmt(m, stmt);
    currentOutSet.put(lhs, ptv);
    outFlowSets.put(stmt, copy(currentOutSet));
}