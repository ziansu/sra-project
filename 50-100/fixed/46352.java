protected org.jtrfp.trcl.pool.EntryBasedIndexPool.Entry<CONTAINED_TYPE> setPoolIndex(int poolIndex) {
    pcs.firePropertyChange(org.jtrfp.trcl.pool.EntryBasedIndexPool.Entry.POOL_INDEX, this.poolIndex, poolIndex);
    getParent().setInDispatcher(this.poolIndex, new DeadEntry(getParent()));
    this.poolIndex = poolIndex;
    getParent().setInDispatcher(poolIndex, this);
    return this;
}