protected void slowUpdate(java.lang.String sql) throws com.alternacraft.pvptitles.Exceptions.DBException, java.sql.SQLException {
    if (isConnected(true)) {
        this.update(sql);
    }
}