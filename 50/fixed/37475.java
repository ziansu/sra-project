public T viewOne(java.lang.Long objId) {
    net.vicp.lylab.core.pool.SequenceTemporaryPool.safeCheck();
    T tmp = net.vicp.lylab.core.pool.SequenceTemporaryPool.getFromContainer(objId);
    return tmp;
}