@java.lang.Override
public void addToCache(com.vexsoftware.votifier.model.Vote v, java.lang.String server) {
    cacheLock.lock();
    try {
        java.util.Collection<com.vexsoftware.votifier.model.Vote> voteCollection = voteCache.get(server);
        if (voteCollection == null) {
            voteCollection = new java.util.LinkedHashSet<>();
            voteCache.put(server, voteCollection);
        }
        voteCollection.add(v);
    } finally {
        cacheLock.unlock();
    }
}