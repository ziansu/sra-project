private java.util.List<org.apache.abdera.model.Entry> filterOlderEntries(java.util.List<org.apache.abdera.model.Entry> unfilteredEntries, java.lang.String lastReadEntryId) {
    int indexOfLastReadEntry = 0;
    for (org.apache.abdera.model.Entry entry : unfilteredEntries) {
        indexOfLastReadEntry++;
        if (entry.getId().toString().equals(lastReadEntryId)) {
            break;
        }
    }
    if (lastReadEntryId == null)
        indexOfLastReadEntry = 0;
    
    java.util.List<org.apache.abdera.model.Entry> result = unfilteredEntries.subList(indexOfLastReadEntry, unfilteredEntries.size());
    return result;
}