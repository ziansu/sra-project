public static void recursiveDivision() {
    int columns = Controller.graph.getColumns();
    int lines = Controller.graph.getLines();
    graph.MazeGenerator.recursiveDivision(0, columns, lines, 0);
    Controller.graph.getObstaclesList().add(new element.MapElement(0, 0, Controller.graph.getPace(), utils.ResourcesUtils.getInstance().getObstacleImage()));
}