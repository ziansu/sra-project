public boolean execute(java.lang.String sql) {
    try {
        return statement.execute(sql);
    } catch (java.sql.SQLException e) {
        java.util.logging.Logger.getLogger("travel").warning(e.getMessage());
        e.printStackTrace();
        return false;
    }
}