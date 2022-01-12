@java.lang.Override
public int findColumn(java.lang.String columnRegex) throws java.sql.SQLException {
    java.lang.Integer foundIndex = cachedIndices.get(columnRegex);
    if (foundIndex == null) {
        foundIndex = findColumnIndex(columnRegex);
        cachedIndices.put(columnRegex, foundIndex);
    }
    if (foundIndex.equals((-1))) {
        throw new java.sql.SQLException("Column for pattern ".concat(columnRegex).concat(" not found"));
    }
    return foundIndex;
}