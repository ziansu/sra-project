public boolean shutdownAllConnectionInstances() {
    try {
        this.dbConnection.close();
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
        return false;
    }
    return true;
}