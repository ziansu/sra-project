private boolean check() {
    try {
        return connection.isValid(1);
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
        return false;
    }
}