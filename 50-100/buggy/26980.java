private void setupEventHandling() {
    eventHandling = new org.cache2k.jcache.provider.event.EventHandling<K, V>();
    eventHandling.registerCache2kListeners(cache2kConfiguration);
    for (javax.cache.configuration.CacheEntryListenerConfiguration<K, V> cfg : config.getCacheEntryListenerConfigurations()) {
        eventHandling.registerListener(cfg);
    }
    eventHandling.init(manager, java.util.concurrent.Executors.newCachedThreadPool());
}