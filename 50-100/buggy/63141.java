public int getThreadsCountGroup(int groupId) throws dibd.storage.StorageBackendException {
    java.sql.ResultSet rs = null;
    int ret = 0;
    try {
        pstmtGetThreadCountGroup.setInt(1, groupId);
        rs = pstmtGetThreadCountGroup.executeQuery();
        if (rs.next())
            ret = rs.getInt(1);
        
        this.restarts = 0;
        return ret;
    } catch (java.sql.SQLException ex) {
        restartConnection(ex);
        return getThreadsCountGroup(groupId);
    } finally {
        closeResultSet(rs);
    }
}