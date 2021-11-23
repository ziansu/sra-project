private void popFriendRequestsFromDB() {
    javax.sql.PooledConnection pCon;
    java.sql.Connection con;
    try {
        pCon = dataSource.getPooledConnection();
        con = pCon.getConnection();
        java.sql.ResultSet resSet = con.createStatement().executeQuery((("SELECT * FROM " + (DBContract.FriendsRequestsTable.TABLE_NAME)) + ";"));
        parseFriendsRequestsResultSet(resSet);
        pCon.close();
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
}