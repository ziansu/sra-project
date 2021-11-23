public boolean execute(java.lang.String sql) {
    try {
        statement.execute(sql);
        return true;
    } catch (java.sql.SQLException e) {
        java.util.logging.Logger.getLogger("travel").warning(e.getMessage());
        e.printStackTrace();
        return false;
    }
}