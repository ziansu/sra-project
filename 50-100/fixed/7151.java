@java.lang.Override
public java.util.ArrayList<cg.group4.rewards.collectibles.Collectible> sortCollectibles(final java.util.HashSet<cg.group4.rewards.collectibles.Collectible> set) {
    java.util.ArrayList<cg.group4.rewards.collectibles.Collectible> sortedList = new java.util.ArrayList<cg.group4.rewards.collectibles.Collectible>(set.size());
    for (cg.group4.rewards.collectibles.Collectible c : set) {
        if (sortedList.isEmpty()) {
            sortedList.add(c);
        }else {
            sortedList.add(findPosition(c, sortedList), c);
        }
    }
    return sortedList;
}