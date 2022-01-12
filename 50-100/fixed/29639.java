public void updatePageAccessStats(bufmgr.Pair entry) {
    bufmgr.LIRS.LIRS_Pair candidate = new bufmgr.LIRS.LIRS_Pair(entry);
    int i = candidateList.indexOf(candidate);
    if (i != (-1)) {
        candidate = candidateList.get(i);
        candidate.updateRecency();
        candidate.updateLastAccessed(globalCount);
        incGlobalCount();
    }
}