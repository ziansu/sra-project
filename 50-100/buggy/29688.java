protected void validateDatabaseName(java.lang.String database, boolean allowNull) throws com.arangodb.ArangoException {
    boolean valid = false;
    if (database == null) {
        if (allowNull) {
            valid = true;
        }
    }else {
        valid = com.arangodb.BaseArangoDriver.databaseNamePattern.matcher(database).matches();
        if (database.equals("_system")) {
            valid = true;
        }
    }
    if (!valid) {
        throw new com.arangodb.ArangoException(("invalid format database:" + database));
    }
}