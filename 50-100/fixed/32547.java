public static void main(java.lang.String[] args) {
    Robot myRobot = new Robot();
    Grid grid = new Grid();
    RobotActions actions = new RobotActions(myRobot, grid);
    actions.findGrid();
    actions.turnLine("Left");
}