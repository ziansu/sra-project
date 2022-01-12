private int compareNumOfAllocations(com.example.nickozoulis.teamproj.domain.Referee lRef, com.example.nickozoulis.teamproj.domain.Referee rRef) {
    if ((lRef.getNumOfMatchAllocated()) > (rRef.getNumOfMatchAllocated()))
        return 1;
    
    if ((lRef.getNumOfMatchAllocated()) < (rRef.getNumOfMatchAllocated()))
        return -1;
    
    if ((lRef.getNumOfMatchAllocated()) == (rRef.getNumOfMatchAllocated()))
        return 0;
    
    throw new java.lang.IllegalStateException("Comparing failed.");
}