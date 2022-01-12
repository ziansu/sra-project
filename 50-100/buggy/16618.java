public static void code() {
    artanis.Soldier.rc = RobotPlayer.rc;
    try {
        artanis.Soldier.runsOnce();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    while (true) {
        try {
            artanis.Soldier.repeat();
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        artanis.Clock.yield();
    } 
}