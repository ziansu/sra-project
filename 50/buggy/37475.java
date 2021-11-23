public T viewOne(java.lang.Long objId) {
    net.vicp.lylab.core.pool.SequenceTemporaryPool.safeCheck();
    T tmp = null;
    try {
        tmp = net.vicp.lylab.core.pool.SequenceTemporaryPool.getFromContainer(objId);
    } catch (java.lang.Exception e) {
    }
    return tmp;
}