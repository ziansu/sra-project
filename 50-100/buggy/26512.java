private static domain.businessrule.database.TargetDatabase parseToTargetDatabase(java.lang.String databaseName, java.lang.String databaseType) {
    domain.businessrule.database.TargetDatabase targetDatabase = null;
    if (databaseType.equals("ORACLE")) {
        targetDatabase = new domain.businessrule.database.OracleTargetDatabase();
        targetDatabase.setName(databaseName);
        targetDatabase.setType(DatabaseType.ORACLE);
    }
    return targetDatabase;
}