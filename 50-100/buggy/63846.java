@java.lang.Override
public boolean takeControl() {
    int dist = robot.getUltrasonicSensor().getDistance();
    boolean ret = ((!(isTurning)) && ((lastDistance) < ((robot.Robot.CLOSE_DISTANCE) * 3))) && (dist > ((robot.Robot.CLOSE_DISTANCE) * 5));
    if (ret) {
        endOfWall = true;
        endOfWallDistance = lastDistance;
    }
    lastDistance = dist;
    return endOfWall;
}