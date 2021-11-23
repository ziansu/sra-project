public maze.Room moveto(maze.Robot robot) {
    maze.Room newRoom = this;
    if (obstacle.equals(null))
        return newRoom;
    
    newRoom = obstacle.moveto(robot);
    if (obstacle.getClass().equals(maze.Spinner.class))
        newRoom = this;
    
    return newRoom;
}