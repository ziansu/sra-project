@java.lang.Override
public int findColumn(java.lang.String label) throws java.sql.SQLException {
    if ((cachedColumnNames) == null) {
        cacheColumnNames();
    }
    java.lang.Integer columnId = cachedColumnNames.get(label);
    if (columnId == null) {
        throw new java.sql.SQLException((("Column " + label) + " does not exists"));
    }
    return columnId;
}