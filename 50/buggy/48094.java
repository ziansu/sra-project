private long distanceToTime(double distance_cm) {
    return ((long) ((1 / (com.ebstor.robot.corefunctions.Robot.CM_PER_MILLISECOND)) / distance_cm));
}