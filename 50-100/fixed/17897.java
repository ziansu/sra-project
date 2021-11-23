public static void main(java.lang.String[] args) {
    if ((args.length) != 2) {
        java.lang.System.out.println("Usage: java mypackage.MultiRobotCoordination [robotCount] [roundroubin=1 | random=2]");
    }else {
        mypackage.MultiRobotCoordination.robotCount = java.lang.Integer.parseInt(args[0]);
        mypackage.MultiRobotCoordination.algorithm = java.lang.Integer.parseInt(args[1]);
        java.lang.System.out.println("Start simulation");
        mypackage.MultiRobotCoordination.robotRoom = new mypackage.RobotRoom(mypackage.MultiRobotCoordination.ROOM_SIZE, mypackage.MultiRobotCoordination.RADIUS, mypackage.MultiRobotCoordination.robotCount);
        java.lang.Thread thread = new java.lang.Thread(mypackage.MultiRobotCoordination.robotRoom);
        thread.start();
    }
}