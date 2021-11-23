protected void slowUpdate(java.lang.String sql) throws com.alternacraft.pvptitles.Exceptions.DBException {
    if (isConnected(true)) {
        try {
            this.connection.createStatement().executeUpdate(sql);
        } catch (java.sql.SQLException ex) {
        }
    }
}