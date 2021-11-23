protected void validateDatabaseName(java.lang.String database, boolean allowNull) throws com.arangodb.ArangoException {
    boolean valid = false;
    if (database == null) {
        if (allowNull) {
            valid = true;
        }
    }else {
        valid = com.arangodb.BaseArangoDriver.databaseNamePattern.matcher(database).matches();
        if ("_system".equals(database)) {
            valid = true;
        }
    }
    if (!valid) {
        throw new com.arangodb.ArangoException(("invalid format database:" + database));
    }
}