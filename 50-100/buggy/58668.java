public static int botToBuild(team006.RobotController rc, team006.MapInfo mapInfo) {
    rc.setIndicatorString(2, ("selfScoutsCreated: " + (mapInfo.selfScoutsCreated)));
    if ((team006.Decision.rand.nextInt(20)) == 9) {
        return 0;
    }else
        if ((mapInfo.timeTillSpawn) < 50) {
            return 2;
        }else
            if ((team006.Decision.rand.nextInt(16)) == 15) {
                return 4;
            }
        
    
    return 1;
}