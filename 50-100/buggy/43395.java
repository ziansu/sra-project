public static void run(lumberjack.RobotController rc) throws java.lang.Exception {
    java.lang.System.out.println("Initializing Lumberjack");
    lumberjack.Lumberjack.rc = rc;
    lumberjack.Lumberjack.dir = ourcommon.Util.getRandomDirection();
    while (true) {
        boolean itterator = false;
        while (itterator = !itterator) {
            if (lumberjack.Lumberjack.farmNutralTrees())
                break;
            
            if (lumberjack.Lumberjack.pounce())
                break;
            
            lumberjack.Lumberjack.fastIdle();
        } 
        lumberjack.Clock.yield();
    } 
}