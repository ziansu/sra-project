public double getFinalTime(us.ihmc.robotics.robotSide.RobotQuadrant key) {
    return get(key).get(((size(key)) - 1)).getTime();
}