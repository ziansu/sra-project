void GenerateGroupSets() {
    java.util.ArrayList<optimalcombinations.Unit> poolCopy = pool_;
    for (optimalcombinations.Group g : allGroups) {
        poolCopy = pool_;
        for (optimalcombinations.Unit u : g.getMembers()) {
            poolCopy.remove(u);
        }
        optimalcombinations.DecreasingUnitPool DUP = new optimalcombinations.DecreasingUnitPool(poolCopy, groupSize_);
        optimalcombinations.GroupSet temp = DUP.findStrongestGroups();
        temp.add(g);
        randomizedSets.add(temp);
    }
}