public static void run(lumberjack.RobotController rc) throws java.lang.Exception {
    java.lang.System.out.println("Initializing Lumberjack");
    rc = rc;
    lumberjack.Tank.dir = lumberjack.Util.getRandomDirection();
    while (true) {
        boolean itterator = false;
        while (itterator = !itterator) {
            lumberjack.Tank.fastIdle(rc);
        } 
        lumberjack.Clock.yield();
    } 
}