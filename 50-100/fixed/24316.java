public void spawn() throws java.lang.Exception {
    int buildPhase = radio.getBuildPhase();
    if (buildPhase == 3) {
        if (rc.isCoreReady()) {
            for (battlecode.common.Direction direction : battlecode.common.Direction.values()) {
                if (rc.canSpawn(direction, RobotType.TANK)) {
                    rc.spawn(direction, RobotType.TANK);
                    return ;
                }
            }
        }
    }
}