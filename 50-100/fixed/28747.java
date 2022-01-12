boolean shakeTheTree(battlecode.common.TreeInfo tree) {
    if (rc.canShake(tree.getLocation())) {
        try {
            rc.shake(tree.getLocation());
        } catch (battlecode.common.GameActionException e) {
        }
        return true;
    }
    return false;
}