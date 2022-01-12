public void injectCacheName(java.lang.Object obj, java.lang.String cacheName) throws org.apache.ignite.IgniteCheckedException {
    assert obj != null;
    if (log.isDebugEnabled())
        log.debug(("Injecting cache name: " + obj));
    
    obj = unwrapTarget(obj);
    inject(obj, GridResourceIoc.ResourceAnnotation.CACHE_NAME, null, null, null);
}