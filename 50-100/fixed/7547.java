public synchronized void remove(final java.lang.String pathname) {
    it.grid.storm.filesystem.AclLockPoolElement e = __map.get(pathname);
    if (null != e) {
        int count = e.decrementUsageCountAndGetIt();
        if (0 >= count)
            __map.remove(pathname);
        
    }
}