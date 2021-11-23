@java.lang.Override
public team379.pathfinding.PathFindResult move(battlecode.common.RobotController rc) throws java.lang.Exception {
    if (((compassDirection) == null) || ((getTarget()) == null)) {
        calculateNextTarget(true);
    }else {
        int distanceSquared = getTarget().distanceSquaredTo(rc.getLocation());
        double distance = java.lang.Math.sqrt(distanceSquared);
        if (distance < (team379.pathfinding.Orbiter.DISTANCE_THRESHOLD)) {
            calculateNextTarget(true);
        }
    }
    return super.move(rc);
}