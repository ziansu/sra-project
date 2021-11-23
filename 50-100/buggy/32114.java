public void sendNote(int id, int friend_id, java.lang.String value) throws java.sql.SQLException {
    java.lang.String tableName = "notes";
    java.lang.String firstColumnName = "from_id";
    java.lang.String SecondColumnName = "to_id";
    java.lang.String thirdColumnName = "value";
    Manager.DBHelper help = new Manager.DBHelper();
    help.insertTrioIntoDbManually(tableName, firstColumnName, SecondColumnName, thirdColumnName, id, friend_id, value);
}