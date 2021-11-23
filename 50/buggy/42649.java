public org.obiba.magma.datasource.jdbc.support.CreateTableChangeBuilder withColumn(java.lang.String columnName, java.lang.String columnType) {
    lastColumn = getColumn(columnName, columnType);
    createTableChange.addColumn(lastColumn);
    nullable();
    return this;
}