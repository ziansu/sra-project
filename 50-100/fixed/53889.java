@java.lang.Override
public void getMazeByName(java.lang.String name) {
    algorithms.mazeGenerators.Maze3d maze = null;
    if ((name.length()) == 0)
        maze = hashMaze.get(this.name);
    else
        maze = hashMaze.get(name);
    
    if (maze == null) {
        setChanged();
        notifyObservers(("Not exist maze by name: " + name));
    }else {
        setChanged();
        notifyObservers(maze);
    }
}