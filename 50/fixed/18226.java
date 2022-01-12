public java.lang.Object getProxy(java.lang.String objectId) {
    synchronized(proxyIdToProxyMap) {
        return proxyIdToProxyMap.get(objectId);
    }
}