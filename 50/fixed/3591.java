org.apache.ignite.internal.processors.cache.GridCacheEntryEx entryEx() {
    assert (key) != null;
    return cctx.cache().entryEx(key);
}