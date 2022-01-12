public static void Disconnect(java.sql.Connection connection) {
    NickSifniotis.DatabaseManager.DBManager.closeQuietly(connection);
}