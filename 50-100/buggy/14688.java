public boolean createAllTables() {
    try {
        for (com.winthier.sql.SQLTable table : tables.values()) {
            java.lang.String sql = table.getCreateTableStatement();
            debugLog(sql);
            executeUpdate(sql);
        }
    } catch (javax.persistence.PersistenceException pe) {
        pe.printStackTrace();
        return false;
    }
    return true;
}