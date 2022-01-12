public boolean init(org.smartdata.server.metastore.DBAdapter adapter) throws java.io.IOException {
    if (adapter != null) {
        this.adapter = adapter;
        try {
            currentActionId = adapter.getMaxActionId();
        } catch (java.lang.Exception e) {
            currentActionId = 1;
            org.smartdata.server.command.CommandExecutor.LOG.error("DB Connection error! Get Max ActionId fail!", e);
            throw new java.io.IOException(e);
        }
        return true;
    }
    return false;
}