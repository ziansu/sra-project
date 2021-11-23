@java.lang.Override
public boolean remove(T object) {
    boolean res = false;
    java.lang.Object fieldValue = mIndexDefinition.getFieldValue(object);
    alluxio.collections.ConcurrentHashSet<T> objSet = mIndexMap.get(fieldValue);
    if (objSet != null) {
        synchronized(objSet) {
            res = objSet.remove(object);
            if (objSet.isEmpty()) {
                res = mIndexMap.remove(fieldValue, objSet);
            }
        }
    }
    return res;
}