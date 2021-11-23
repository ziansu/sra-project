public static void startExploration(java.lang.String sensorData) {
    algorithm.RobotManager.sensor.getReadingsFromExt(sensorData);
    algorithm.RobotManager.getSensoryInfo();
    algorithm.Movable.MOVE nextMove = algorithm.RobotManager.explorationStrategy.nextMove();
    io.NetworkIOManager.sendMessage(("A" + (algorithm.RobotManager.convertMove(nextMove))));
    java.lang.Thread thread = new java.lang.Thread() {
        @java.lang.Override
        public void run() {
            algorithm.RobotManager.decodeMove(nextMove);
        }
    };
    thread.start();
    ++(algorithm.RobotManager.moveCounter);
    algorithm.RobotManager.displayExplorationPercentage();
    algorithm.RobotManager.displayMoves(nextMove, algorithm.RobotManager.moveCounter);
}