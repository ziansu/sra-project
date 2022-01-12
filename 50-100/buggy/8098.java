private static void deleteValues(java.lang.String tableName, java.lang.Integer ID) {
    for (java.lang.String s : JSQL.table.get(tableName).get((ID - 1)).keySet()) {
        JSQL.table.get(tableName).get((ID - 1)).put(s, null);
    }
}