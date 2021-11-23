public static boolean isDatabaseExistOnServer(com.mera.database.Executor executor, java.lang.String databaseName) {
    boolean result = false;
    java.util.HashSet<java.lang.String> dataBases = com.mera.database.DataBase.getDataBaseListFromServer(executor, new com.mera.io.FileOnDisc());
    for (java.lang.String database : dataBases) {
        if (databaseName.equalsIgnoreCase(database)) {
            result = true;
            break;
        }
    }
    return result;
}