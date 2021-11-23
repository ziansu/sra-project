public java.lang.String getTableName() {
    if ((tableName) != null) {
        return tableName;
    }
    java.lang.Class<?> type = getTypeClass();
    java.lang.String tableName = (tableNamePrefix) + (convertFieldName(type.getSimpleName()));
    return tableName;
}