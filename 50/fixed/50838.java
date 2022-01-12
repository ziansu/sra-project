public boolean existTable(java.lang.String tableName) {
    java.util.List<java.lang.String> tableLists = getCurrentTables(com.xl.preferences.DatabasePreferences.getInstance().getCurrentDatabase());
    return tableLists.contains(tableName.toLowerCase());
}