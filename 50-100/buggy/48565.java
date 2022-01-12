public boolean isTableRequiredAfterIteration(java.lang.String tableName, int iteration) {
    java.util.HashSet<java.lang.String> dependentTables = getDependentTables(tableName);
    for (java.lang.String dependentTable : dependentTables) {
        if ((getTickForTable(dependentTable)) > iteration) {
            return true;
        }
    }
    return false;
}