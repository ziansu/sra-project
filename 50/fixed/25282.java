public void initEntryAndKey(long entrySize) {
    initAllocatedChunks(hh.h().inChunks(entrySize));
    incrementSegmentEntriesIfNeeded();
    entry.writeNewEntry(s.alloc(allocatedChunks), q.inputKey);
}