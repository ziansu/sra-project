private void checkDuplicateColumns(com.google.common.collect.ImmutableList<java.lang.String> columnNames) {
    java.util.Set<java.lang.String> columnNameSet = new java.util.HashSet<>();
    for (java.lang.String columnName : columnNames) {
        columnName = columnName.toLowerCase();
        if (columnNameSet.contains(columnName)) {
            throw new java.lang.IllegalStateException(("Duplicate column: " + columnName));
        }
        columnNameSet.add(columnName);
    }
}