public static void reset() {
    algorithm.RobotManager.setRobot(0, 0, algorithm.RobotManager.ORIENTATION.EAST);
    algorithm.RobotManager.setMapExplored(null);
    algorithm.RobotManager.moveStrategy = new algorithm.FloodFillMove();
    MainControl.mainWindow.setRobotPosition("unknown");
    MainControl.mainWindow.setTimerDisplay(java.lang.String.format("%d min %d s %d ms", 0, 0, 0));
    MainControl.mainWindow.setMapExplored(java.lang.String.format("Map Explored: %.2f%%", 0.0));
    MainControl.mainWindow.clearFreeOutput();
}