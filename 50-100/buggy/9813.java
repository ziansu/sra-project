public void displayMaze(algorithms.mazeGenerators.Maze3d m, java.lang.String name) {
    maze = new view.Maze3dDisplay(shell, org.eclipse.swt.SWT.BORDER, this);
    maze.setLayoutData(new org.eclipse.swt.layout.GridData(org.eclipse.swt.SWT.FILL, org.eclipse.swt.SWT.FILL, true, true, 1, 1));
    maze.initMaze(m, name, "images/fly.png");
    maze.moveAbove(welcome);
    welcome.dispose();
    shell.layout(true);
    menu.displayGoalGuide();
    menu.setGoalFloorText(m.getGoalPosition().z);
}