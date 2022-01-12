final java.lang.Object readOldEntry(java.lang.String regionName, final java.lang.Object entryKey, final boolean checkValid) {
    if ((oldEntryMap.containsKey(regionName)) && (this.oldEntryMap.get(regionName).containsKey(((com.gemstone.gemfire.internal.cache.RegionEntry) (entryKey)).getKeyCopy()))) {
        return oldEntryMap.get(regionName).get(((com.gemstone.gemfire.internal.cache.RegionEntry) (entryKey)).getKeyCopy()).last();
    }else {
        return null;
    }
}