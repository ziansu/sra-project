boolean isInWoods() {
    battlecode.common.TreeInfo[] nearbyTrees = rc.senseNearbyTrees(TeamConstants.GARDENERS_DEFAULT_FREE_SPOT_RADIUS, Team.NEUTRAL);
    if ((nearbyTrees.length) > (TeamConstants.GARDENER_NUM_OF_TREES_TO_BUILD_LUMBER))
        return true;
    else
        return false;
    
}