public org.apache.hadoop.smart.sql.CommandInfo getCommandInfo(long cid) throws java.io.IOException {
    if (cmdsAll.containsKey(cid))
        return cmdsAll.get(cid);
    
    java.util.List<org.apache.hadoop.smart.sql.CommandInfo> ret = null;
    try {
        adapter.getCommandsTableItem(java.lang.String.format("= %d", cid), null, null);
    } catch (java.sql.SQLException e) {
        org.apache.hadoop.smart.CommandExecutor.LOG.error(e.getMessage());
    }
    if (ret != null)
        return ret.get(0);
    
    return null;
}