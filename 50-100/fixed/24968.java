public T remove(long objId, boolean isAvailable) {
    synchronized(lock) {
        safeCheck();
        T tmp = null;
        if (isAvailable)
            tmp = net.vicp.lylab.core.pool.SeparatePool.removeFromContainer(objId);
        else {
            tmp = busyContainer.remove(objId);
            keyContainer.remove(objId);
        }
        return tmp;
    }
}