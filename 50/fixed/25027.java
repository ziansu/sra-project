static boolean tryMove(battlecode.common.Direction dir) throws battlecode.common.GameActionException {
    return stars.Bug.tryMove(dir, 10, 4);
}