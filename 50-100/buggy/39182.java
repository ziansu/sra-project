public void acceptFriendRequest(int id, int friend_id) throws java.sql.SQLException {
    java.lang.String tableName = "friends";
    java.lang.String tableName2 = "friend_requests";
    java.lang.String firstColumnName = "first_friend_id";
    java.lang.String SecondColumnName = "second_friend_id";
    java.lang.String firstColumnName1 = "request_from";
    java.lang.String SecondColumnName2 = "request_to";
    Manager.DBHelper help = new Manager.DBHelper();
    help.insertCoupleIntstIntoDbManually(tableName, firstColumnName, SecondColumnName, id, friend_id);
    help.deleteCoupleIntstFromDbManually(tableName2, firstColumnName1, SecondColumnName2, id, friend_id);
}