protected boolean reservedTable() {
    return (((isSecret()) || (isUsedForMetaRegion())) || (isUsedForPartitionedRegionAdmin())) || (com.gemstone.gemfire.internal.cache.LocalRegion.isMetaTable(this.getFullPath()));
}