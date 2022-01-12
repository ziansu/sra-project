@java.lang.Override
public synchronized java.util.List<T> accessMany(java.lang.Integer amount) {
    safeCheck();
    java.util.List<T> retList = new java.util.ArrayList<T>();
    java.util.Iterator<java.lang.Long> iterator = keyContainer.iterator();
    for (int i = 0; (!(iterator.hasNext())) && (i < amount); i++) {
        retList.add(net.vicp.lylab.core.pool.SequencePool.getFromContainer(iterator.next()));
    }
    return retList;
}