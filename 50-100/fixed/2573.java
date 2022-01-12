@java.lang.Override
public void unstore(lucee.runtime.type.scope.storage.IKStorageScopeSupport storageScope, lucee.runtime.PageContext pc, java.lang.String appName, java.lang.String name, java.lang.String cfid, lucee.commons.io.log.Log log) {
    try {
        lucee.commons.io.cache.Cache cache = lucee.runtime.type.scope.storage.IKHandlerCache.getCache(pc, name);
        java.lang.String key = lucee.runtime.type.scope.storage.IKHandlerCache.getKey(cfid, appName, storageScope.getTypeAsString());
        synchronized(cache) {
            cache.remove(key);
        }
    } catch (java.lang.Exception pe) {
    }
}