public bufmgr.Pair getReplacementCandidate(global.PageId targetPage) {
    bufmgr.Pair returnCandidate = null;
    if (!(freeList.isEmpty())) {
        returnCandidate = freeList.removeFirst();
        returnCandidate.setPageId(targetPage);
        bufmgr.LIRS.LIRS_Pair tmpLIRSEntry = new bufmgr.LIRS.LIRS_Pair(returnCandidate);
        candidateList.add(tmpLIRSEntry);
    }else {
        computeStats();
        returnCandidate = victim.getCandidateInfo();
        victim.reset();
    }
    return new bufmgr.Pair(returnCandidate);
}