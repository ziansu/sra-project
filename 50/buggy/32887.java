public battlecode.common.MapLocation getTowerLocationByNumber(int towerNumber) {
    battlecode.common.MapLocation[] towers = rc.senseTowerLocations();
    return towers[towerNumber];
}