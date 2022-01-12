public static void run(lumberjack.RobotController rc) throws java.lang.Exception {
    java.lang.System.out.println("Initializing Soldier");
    lumberjack.Soldier.dir = lumberjack.Util.getRandomDirection();
    while (true) {
        boolean itterator = false;
        while (itterator = !itterator) {
            lumberjack.Soldier.fastIdle(rc);
        } 
        lumberjack.Clock.yield();
    } 
}