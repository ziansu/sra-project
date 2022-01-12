protected boolean isOpen() {
    try {
        if (((con) != null) && (!(con.isClosed()))) {
            return true;
        }
    } catch (java.sql.SQLException e) {
    }
    return false;
}