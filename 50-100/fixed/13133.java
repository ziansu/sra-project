public int fetchResults(java.util.Map.Entry<java.lang.String, java.lang.Integer>[] entries, int count) {
    int i;
    for (i = 0; (i < count) && ((currentEntry) != null); i++) {
        if (!(currentEntry.getKey().startsWith(searchWord)))
            break;
        
        entries[i] = currentEntry;
        currentEntry = map.higherEntry(currentEntry.getKey());
    }
    return i;
}