public int getThreadsCountGroup(int groupId) throws dibd.storage.StorageBackendException {
    java.sql.ResultSet rs = null;
    try {
        pstmtGetThreadCountGroup.setInt(1, groupId);
        rs = pstmtGetThreadCountGroup.executeQuery();
        rs.next();
        return rs.getInt(1);
    } catch (java.sql.SQLException ex) {
        restartConnection(ex);
        return getThreadsCountGroup(groupId);
    } finally {
        closeResultSet(rs);
    }
}