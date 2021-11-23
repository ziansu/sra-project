public void updatePageAccessStats(bufmgr.Pair entry) {
    bufmgr.LIRS.LIRS_Pair candidate;
    int i = candidateList.indexOf(entry);
    if (i != (-1)) {
        candidate = candidateList.get(i);
        candidate.updateRecency();
        candidate.updateLastAccessed(globalCount);
        incGlobalCount();
    }
}