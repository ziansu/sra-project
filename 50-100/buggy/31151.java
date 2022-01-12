public bufmgr.Pair hashKey(global.PageId pageNumber) throws bufmgr.HashEntryNotFoundException {
    bufmgr.Pair result;
    bufmgr.HashTable.Bucket directoryEntry;
    java.lang.System.out.println(("PageID to be looked up: " + (pageNumber.pid)));
    java.lang.System.out.println(((("Hash table returns h(" + (pageNumber.pid)) + ")= ") + (h(pageNumber.pid))));
    directoryEntry = directory[h(pageNumber.pid)];
    result = directoryEntry.search(pageNumber);
    if (result.isPairEmpty())
        throw new bufmgr.HashEntryNotFoundException(null, "PageID is not found in the buffer pool");
    else
        return result;
    
}