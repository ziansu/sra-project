@java.lang.Override
public void stop() throws java.lang.Exception {
    if (org.apache.camel.management.MBeanInfoAssembler.LOG.isDebugEnabled()) {
        org.apache.camel.management.MBeanInfoAssembler.LOG.debug("Clearing cache[size={}, hits={}, misses={}, evicted={}]", new java.lang.Object[]{ cache.size() , cache.getHits() , cache.getMisses() , cache.getEvicted() });
    }
    cache.clear();
}