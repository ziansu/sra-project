public bufmgr.Pair hashKey(global.PageId pageNumber) throws bufmgr.HashEntryNotFoundException {
    bufmgr.Pair result;
    bufmgr.HashTable.Bucket directoryEntry;
    directoryEntry = directory[h(pageNumber.pid)];
    result = directoryEntry.search(pageNumber);
    if (result.isPairEmpty())
        throw new bufmgr.HashEntryNotFoundException(null, "PageID is not found in the buffer pool");
    else
        return result;
    
}