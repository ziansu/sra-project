private void unpinAll(org.vanilladb.core.storage.tx.Transaction tx) {
    java.util.Set<org.vanilladb.core.storage.buffer.BufferMgr.PinnedBuffer> pinnedBuffs = new java.util.HashSet<org.vanilladb.core.storage.buffer.BufferMgr.PinnedBuffer>(pinnedBuffers.values());
    if (pinnedBuffs != null) {
        for (org.vanilladb.core.storage.buffer.BufferMgr.PinnedBuffer pinnedBuff : pinnedBuffs)
            org.vanilladb.core.storage.buffer.BufferMgr.bufferPool.unpin(pinnedBuff.buffer);
        
    }
    synchronized(org.vanilladb.core.storage.buffer.BufferMgr.bufferPool) {
        org.vanilladb.core.storage.buffer.BufferMgr.bufferPool.notifyAll();
    }
}