@java.lang.Override
public void logVarUsed(java.lang.String var) {
    try {
        java.sql.PreparedStatement prep = conn.prepareStatement(log.SQLiteLogger.varUsedInsert);
        prep.setInt(1, runId);
        prep.setInt(2, line);
        prep.setInt(3, availableVars.get(var));
        prep.execute();
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
}