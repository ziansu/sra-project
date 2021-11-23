@java.lang.Override
public java.util.Collection<com.vexsoftware.votifier.model.Vote> evict(java.lang.String server) {
    cacheLock.lock();
    try {
        java.util.Collection<com.vexsoftware.votifier.model.Vote> fromCollection = voteCache.remove(server);
        return fromCollection != null ? com.google.common.collect.ImmutableSet.copyOf(fromCollection) : com.google.common.collect.ImmutableSet.<com.vexsoftware.votifier.model.Vote>of();
    } finally {
        cacheLock.unlock();
    }
}