private static domain.businessrule.database.TargetDatabase parseToTargetDatabase(java.lang.String databaseType) {
    domain.businessrule.database.TargetDatabase targetDatabase = null;
    if (databaseType != null) {
        if (databaseType.equals("ORACLE")) {
            targetDatabase = new domain.businessrule.database.OracleTargetDatabase();
            targetDatabase.setType(DatabaseType.ORACLE);
        }
    }
    return targetDatabase;
}