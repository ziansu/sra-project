public edu.uiuc.zenvisage.data.roaringdb.db.ColumnMetadata getColumnMetaData(java.lang.String columnName) {
    edu.uiuc.zenvisage.data.roaringdb.db.Column column = columns.get(((columnName.substring(0, 1).toUpperCase()) + (columnName.substring(1))));
    return column.columnMetadata;
}