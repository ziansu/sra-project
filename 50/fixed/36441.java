private static void logCache() {
    if (com.datastax.driver.core.CCMCache.LOGGER.isDebugEnabled())
        com.datastax.driver.core.CCMCache.LOGGER.debug("Free memory: {}, Cache {}", com.datastax.driver.core.TestUtils.getFreeMemoryMB(), com.datastax.driver.core.CCMCache.CACHE.asMap().keySet());
    
}