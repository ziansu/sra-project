public boolean waterWeakest() throws battlecode2017.GameActionException {
    battlecode2017.TreeInfo weakest = trees.getWeakestTreeWithinInteract(team);
    if (((weakest.health) <= (TREE_WATERING_THRESHOLD)) && (rc.canWater(weakest.location))) {
        rc.water(weakest.location);
        return true;
    }else {
        return false;
    }
}