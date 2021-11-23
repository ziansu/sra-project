public void showMaze(algorithms.mazeGenerators.Maze m, boolean resetChar) {
    if (resetChar == true) {
        this.character = null;
    }
    if (m != (maze)) {
        this.character = null;
        maze = m;
    }
    setBackgroundImage(new org.eclipse.swt.graphics.Image(null, scrBackground));
    redraw();
}