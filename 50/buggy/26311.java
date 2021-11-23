protected java.lang.String getPlanString(java.lang.String sqlStmt) throws org.json_voltpatches.JSONException {
    org.voltdb.plannodes.AbstractPlanNode node = compile(sqlStmt);
    java.lang.String planString = org.voltdb.planner.PlanSelector.outputPlanDebugString(node);
    return planString;
}