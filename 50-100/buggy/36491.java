public void computeBranch() {
    getTg().computeBranch(getBaseLimb());
    if ((level) < 4)
        addSubBranches();
    
    if (subLimbs.isEmpty())
        return ;
    
    for (int i = subLimbs.size(); i > 0; i--) {
        subLimbs.get(i).setLine(getTg().computeBranch(subLimbs.get(i).getBaseLimb()));
    }
}