public static void startExploration(java.lang.String sensorData) {
    algorithm.RobotManager.sensor.getReadingsFromExt(sensorData);
    algorithm.RobotManager.getSensoryInfo();
    algorithm.Movable.MOVE nextMove = algorithm.RobotManager.explorationStrategy.nextMove();
    io.NetworkIOManager.sendMessage(("A" + (algorithm.RobotManager.convertMove(nextMove))));
    algorithm.RobotManager.decodeMove(nextMove);
    ++(algorithm.RobotManager.moveCounter);
    algorithm.RobotManager.displayExplorationPercentage();
    algorithm.RobotManager.displayMoves(nextMove, algorithm.RobotManager.moveCounter);
}