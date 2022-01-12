public static int turretDefend(team006.RobotController rc, team006.MapInfo mapInfo) {
    try {
        rc.setIndicatorString(0, "defending cause I'm a turret");
        return team006.RobotTasks.attackMoveToLocation(rc, mapInfo, mapInfo.selfLoc);
    } catch (java.lang.Exception e) {
        java.lang.System.out.println(e.getMessage());
        e.printStackTrace();
    }
    return team006.RobotTasks.TASK_ABANDONED;
}