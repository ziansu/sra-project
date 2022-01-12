@java.lang.Override
public void close() {
    if ((closed) == true)
        return ;
    
    commitLock.lock();
    try {
        if ((closed) == true)
            return ;
        
        closed = true;
        flush();
        vol.close();
        vol = null;
        if ((caches) != null) {
            for (org.mapdb.Cache c : caches) {
                c.close();
            }
            java.util.Arrays.fill(caches, null);
        }
    } finally {
        commitLock.unlock();
    }
}