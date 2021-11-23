@java.lang.Override
public synchronized T accessOne() {
    safeCheck();
    if (keyContainer.isEmpty())
        return null;
    
    T tmp = null;
    java.lang.Long key = keyContainer.get(0);
    tmp = net.vicp.lylab.core.pool.SequencePool.getFromContainer(key);
    return tmp;
}