private void assertUninitialized() {
    if ((_state) != (org.dcache.pool.repository.v5.CacheRepositoryV5.State.UNINITIALIZED)) {
        throw new java.lang.IllegalStateException("Operation not allowed after initialization");
    }
}