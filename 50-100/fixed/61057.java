final java.lang.Object readOldEntry(java.lang.String regionName, final java.lang.Object entryKey, final boolean checkValid) {
    if ((oldEntryMap.containsKey(regionName)) && (this.oldEntryMap.get(regionName).containsKey(entryKey))) {
        return oldEntryMap.get(regionName).get(entryKey).last();
    }else {
        return null;
    }
}