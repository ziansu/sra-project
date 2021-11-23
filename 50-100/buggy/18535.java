private void rebuildShadowTree() {
    java.util.Map<org.zkoss.zk.ui.Component, java.lang.Integer> oldCacheMap = getIndexCacheMap();
    final boolean destroyCacheMap = oldCacheMap == null;
    try {
        if (destroyCacheMap)
            oldCacheMap = initIndexCacheMap();
        
        rebuildSubShadowTree();
    } finally {
        if (destroyCacheMap)
            destroyIndexCacheMap();
        
    }
}