private int check() {
    try {
        return connection.isValid(1) ? 0 : 1;
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
    return 0;
}