boolean shakeTheTree(battlecode.common.TreeInfo tree) {
    if (rc.canShake(tree.getLocation())) {
        try {
            rc.shake(tree.getLocation());
        } catch (battlecode.common.GameActionException e) {
            e.printStackTrace();
        }
        return true;
    }
    return false;
}