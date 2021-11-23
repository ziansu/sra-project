@java.lang.Override
public void setCurrentMaze(algorithms.mazeGenerators.Maze3d m) {
    currentMaze = m;
    mazeData = currentMaze.getCrossSectionByY(currentMaze.getEnter().getDim());
    setCharacterPosition(currentMaze.getEnter().getDim(), currentMaze.getEnter().getWid(), currentMaze.getEnter().getLen());
    redraw();
}