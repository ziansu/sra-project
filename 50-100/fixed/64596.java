public synchronized void unload() {
    try {
        innerUnload();
        return ;
    } catch (com.avaje.ebeaninternal.server.lib.sql.DataSourceException dse) {
        RealisticBiomes.LOG.log(java.util.logging.Level.WARNING, "Looks like DB has gone away: ", dse);
    }
    try {
        plugin.getPlantManager().reconnect();
        innerUnload();
    } catch (com.avaje.ebeaninternal.server.lib.sql.DataSourceException dse) {
        RealisticBiomes.LOG.log(java.util.logging.Level.WARNING, "DB really has gone away: ", dse);
        throw dse;
    }
}