@java.lang.Override
public liquibase.datatype.DatabaseDataType toDatabaseDataType(liquibase.database.Database database) {
    if (database instanceof liquibase.database.core.MySQLDatabase) {
        if (getRawDefinition().contains(" ")) {
            return new liquibase.datatype.DatabaseDataType(getRawDefinition());
        }
        return super.toDatabaseDataType(database);
    }
    if (database instanceof liquibase.database.core.MSSQLDatabase) {
        return new liquibase.datatype.DatabaseDataType("DATETIME");
    }
    return super.toDatabaseDataType(database);
}