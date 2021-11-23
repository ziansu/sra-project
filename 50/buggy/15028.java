void unsubscribe(java.lang.String userID) throws java.sql.SQLException {
    servlets.DatabaseHandler dh = new servlets.DatabaseHandler();
    dh.deleteSubscription(this, userID);
}