private boolean sourceDatabaseAccessible(ca.sqlpower.sqlobject.SQLColumn sourceColumn, ca.sqlpower.architect.swingui.ArchitectSwingSession targetSession) {
    ca.sqlpower.sqlobject.SQLDatabase sourceSourceDatabase;
    if ((sourceColumn.getSourceColumn()) == null) {
        sourceColumn.setSourceColumn(sourceColumn);
    }
    sourceSourceDatabase = ca.sqlpower.util.SQLPowerUtils.getAncestor(sourceColumn.getSourceColumn(), ca.sqlpower.sqlobject.SQLDatabase.class);
    if ((targetSession.getDBTree().getDuplicateDbcs(sourceSourceDatabase.getDataSource())) == null) {
        return false;
    }else {
        return true;
    }
}