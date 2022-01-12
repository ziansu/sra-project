public void insertFreeListEntry(bufmgr.Pair entry) throws bufmgr.LIRSFailureException {
    bufmgr.LIRS.LIRS_Pair tempEntry = new bufmgr.LIRS.LIRS_Pair(entry);
    candidateList.remove(tempEntry);
    java.lang.Boolean status = freeList.add(entry);
    if (!status)
        throw new bufmgr.LIRSFailureException(null, "LIRS Failed to insert into free list");
    
}