public clojure.lang.IFn getMethod(java.lang.Object dispatchVal) {
    if ((cachedHierarchy) != (hierarchy.deref()))
        resetCache();
    
    clojure.lang.IFn targetFn = ((clojure.lang.IFn) (methodCache.valAt(dispatchVal)));
    if (targetFn != null)
        return targetFn;
    
    return findAndCacheBestMethod(dispatchVal);
}