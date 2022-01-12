public void run() {
    setPerspective.setText("z");
    mazeDisplay.set3DMaze(maze3DArray);
    java.lang.String command = ((("display_cross_section " + ("z" + " ")) + (maze.getStartPosition().getZ())) + " ") + (mazeName);
    setChanged();
    notifyObservers(command);
}