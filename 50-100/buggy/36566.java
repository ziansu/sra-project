protected boolean isOutofTable(com.robot.RobotInfo robotInfo) {
    if (((robotInfo.getX()) < 0) || ((robotInfo.getX()) > (robotInfo.getMaxUnits()))) {
        return true;
    }
    if (((robotInfo.getY()) < 0) || ((robotInfo.getY()) > (robotInfo.getMaxUnits()))) {
        return true;
    }
    return false;
}