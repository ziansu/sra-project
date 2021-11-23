void rollback() throws java.sql.SQLException {
    if ((mConnection) != null) {
        mConnection.rollback();
    }
}