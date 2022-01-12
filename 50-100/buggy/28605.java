protected void notify(K key, V oldValue, V newValue) {
    if ((CC.ASSERT) && (!(segmentLocks[((hash(key)) >>> 28)].isWriteLockedByCurrentThread())))
        throw new java.lang.AssertionError();
    
    org.mapdb.Bind[] modListeners2 = modListeners;
    for (org.mapdb.Bind.MapListener<K, V> listener : modListeners2) {
        if (listener != null)
            listener.update(key, oldValue, newValue);
        
    }
}