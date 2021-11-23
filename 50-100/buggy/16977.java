public void resetPool(java.lang.String host, java.lang.String path) {
    java.lang.String hostTargetKey = generateHostTargetKey(host, path);
    logger.info(("Attempting to return WebClient to pool: " + hostTargetKey));
    com.appdynamics.sample.rest.client.WebClientPool pool = clientPool.get(hostTargetKey);
    if (pool != null) {
        pool.seedPool();
    }
    logger.info((((((("Resetting web client for pool " + hostTargetKey) + ", pool usage is now [ ") + (pool.getUsageCount())) + " / ") + (pool.getSize())) + " ]"));
}