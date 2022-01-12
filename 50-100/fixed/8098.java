private static void deleteValues(java.lang.String tableName, java.lang.Integer ID) {
    for (java.lang.String s : JSQL.table.get(tableName).get(ID).keySet()) {
        JSQL.table.get(tableName).get(ID).put(s, null);
    }
}