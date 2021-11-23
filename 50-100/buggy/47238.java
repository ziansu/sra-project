public void insertFreeListEntry(bufmgr.Pair entry) throws bufmgr.LIRSFailureException {
    bufmgr.LIRS.LIRS_Pair tempEntry = new bufmgr.LIRS.LIRS_Pair(entry);
    java.lang.Boolean status = candidateList.remove(tempEntry);
    status &= freeList.add(entry);
    if (!status)
        throw new bufmgr.LIRSFailureException(null, "LIRS Failed to insert into free list");
    
}