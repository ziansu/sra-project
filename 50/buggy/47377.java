public void deleteAllItemsForUser(int userID) throws java.sql.SQLException {
    makeDBConnection();
    try {
        com.jg.db.PostGresSingleton.deleteSQLQuery(userID);
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    } finally {
        com.jg.db.PostGresSingleton.dbConnection.close();
    }
}