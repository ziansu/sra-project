@java.lang.Override
public void mouseReleased(java.awt.event.MouseEvent arg0) {
    java.lang.String filename = "";
    MazeGenerator.Maze tempMaze = new MazeGenerator.Maze();
    tempMaze.setTitle(inpMazeTitle.getText());
    tempMaze.setGridSize(sldGridSize.getValue());
    tempMaze.setActiveNodeCount(sldActiveNodeCount.getValue());
    tempMaze.generateMaze();
    filename = tempMaze.toFile();
    model1.addElement(filename);
    list.setSelectedValue(filename, true);
}