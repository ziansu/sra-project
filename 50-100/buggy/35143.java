private void unpinAll(org.vanilladb.core.storage.tx.Transaction tx) {
    java.util.Collection<org.vanilladb.core.storage.buffer.BufferMgr.PinnedBuffer> pinnedBuffs = pinnedBuffers.values();
    if (pinnedBuffs != null) {
        for (org.vanilladb.core.storage.buffer.BufferMgr.PinnedBuffer pinnedBuff : pinnedBuffs)
            org.vanilladb.core.storage.buffer.BufferMgr.bufferPool.unpin(pinnedBuff.buffer);
        
    }
    synchronized(org.vanilladb.core.storage.buffer.BufferMgr.bufferPool) {
        org.vanilladb.core.storage.buffer.BufferMgr.bufferPool.notifyAll();
    }
}