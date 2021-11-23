public static void createOtherDeletionStatement(java.lang.String tableName) {
    java.lang.String empty = ("DELETE FROM " + tableName) + ";";
    src.SQLMethods.queries.add(empty);
}