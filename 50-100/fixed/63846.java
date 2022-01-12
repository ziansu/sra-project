@java.lang.Override
public boolean takeControl() {
    int dist = robot.getUltrasonicSensor().getDistance();
    boolean ret = ((!(isTurning)) && ((lastDistance) < (3 * (robot.Robot.CLOSE_DISTANCE)))) && ((dist - (lastDistance)) > (robot.Robot.CLOSE_DISTANCE));
    if (ret) {
        endOfWall = true;
        endOfWallDistance = lastDistance;
    }
    lastDistance = dist;
    return endOfWall;
}