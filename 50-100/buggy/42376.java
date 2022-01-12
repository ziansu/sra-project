public void purge() {
    synchronized(memcache) {
        for (ch.systemsx.sybit.crkwebui.server.commons.util.io.FileCache.CacheFile cacheFile : memcache.values()) {
            cacheFile.delete();
        }
        if ((notpurged) != null) {
            for (java.lang.String filename : notpurged) {
                java.io.File file = new java.io.File(filename);
                file.delete();
            }
        }
        memcache.clear();
        queue.clear();
        notpurged = new com.google.gwt.dev.util.collect.HashSet();
    }
}