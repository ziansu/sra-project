public static void createObject(java.lang.String dataBaseName, com.mera.database.Executor executor, com.mera.mysql.DataBaseObject dataBaseObject) {
    java.lang.String sqlUpdate = dataBaseObject.getBody();
    int result = executor.execUpdate(dataBaseName, sqlUpdate);
}