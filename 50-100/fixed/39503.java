void GenerateGroupSets() {
    java.util.ArrayList<optimalcombinations.Unit> poolCopy = new java.util.ArrayList<optimalcombinations.Unit>();
    for (optimalcombinations.Group g : allGroups) {
        for (optimalcombinations.Unit u : pool_) {
            poolCopy.add(u);
        }
        for (optimalcombinations.Unit u : g.getMembers()) {
            poolCopy.remove(u);
        }
        optimalcombinations.DecreasingUnitPool DUP = new optimalcombinations.DecreasingUnitPool(poolCopy, groupSize_);
        optimalcombinations.GroupSet temp = DUP.findStrongestGroups();
        temp.add(g);
        randomizedSets.add(temp);
    }
}