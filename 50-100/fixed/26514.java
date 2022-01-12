public static void run(battlecode.common.RobotController rc) throws java.lang.Exception {
    java.lang.System.out.println("Innitilizeing");
    while (true) {
        ourcommon.Building.tryBuild(RobotType.LUMBERJACK, ourcommon.Util.getRandomDirection(), rc);
        ourcommon.Movement.tryMove(ourcommon.Util.getRandomDirection(), rc);
        java.lang.System.out.println(battlecode.common.Clock.getBytecodeNum());
        battlecode.common.Clock.yield();
    } 
}