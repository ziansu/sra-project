public void computeBranch() {
    setLine(getTg().computeBranch(getBaseLimb()));
    if ((level) < 4)
        addSubBranches();
    
    if (subLimbs.isEmpty())
        return ;
    
    for (int i = (subLimbs.size()) - 1; i >= 0; i--) {
        subLimbs.get(i).setLine(getTg().computeBranch(subLimbs.get(i).getBaseLimb()));
    }
}