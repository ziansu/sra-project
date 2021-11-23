static boolean tryMove(battlecode.common.RobotController rc, battlecode.common.Direction dir) throws battlecode.common.GameActionException {
    return stars.Bug.tryMove(rc, dir, 10, 4);
}