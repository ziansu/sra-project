void commit() throws java.sql.SQLException {
    if ((mConnection) != null) {
        mConnection.commit();
    }
}