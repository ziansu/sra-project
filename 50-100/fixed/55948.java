public final void releaseConnection(final com.zaxxer.hikari.pool.PoolBagEntry bagEntry) {
    metricsTracker.recordConnectionUsage(bagEntry);
    if (bagEntry.evicted) {
        LOGGER.debug("Connection returned to pool {} is broken or evicted.  Closing connection.", configuration.getPoolName());
        closeConnection(bagEntry, "connection broken or evicted");
    }else {
        connectionBag.requite(bagEntry);
    }
}