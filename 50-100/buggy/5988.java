public final void enableCache() {
    this.enableValueCache = true;
    if ((this.valueToIdCache) == null)
        this.valueToIdCache = new java.lang.ref.SoftReference<>(new java.util.concurrent.ConcurrentHashMap());
    
    if ((this.idToValueCache) == null)
        this.idToValueCache = new java.lang.ref.SoftReference<>(new java.lang.Object[org.apache.kylin.dict.CacheDictionary.getSize()]);
    
}