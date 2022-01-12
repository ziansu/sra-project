@java.lang.SuppressWarnings(value = "rawtypes")
public java.lang.Object createProxy(java.lang.ClassLoader cl, java.lang.Class[] ca, java.lang.String objectId) {
    java.lang.Object result = super.createProxy(cl, ca, objectId);
    synchronized(proxyIdToProxyMap) {
        proxyIdToProxyMap.put(objectId, result);
    }
    return result;
}