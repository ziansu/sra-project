public java.lang.String getTableName() {
    if ((tableName) != null) {
        return tableName;
    }
    java.lang.Class<?> type = getTypeClass();
    java.lang.String tableName = (tableNamePrefix) + (jazmin.driver.jdbc.SmartBeanDAO.convertFieldName(type.getSimpleName()));
    return tableName;
}