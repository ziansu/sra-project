public void declineFriendRequest(int id, int friend_id) throws java.sql.SQLException {
    java.lang.String tableName = "friend_requests";
    java.lang.String firstColumnName = "request_from";
    java.lang.String SecondColumnName = "request_to";
    help = new Manager.DBHelper();
    help.deleteCoupleIntstFromDbManually(tableName, firstColumnName, SecondColumnName, id, friend_id);
}