public double checkEast() {
    int x = this.getX();
    if ((x != (Main.maze[0].length)) && (!(Main.maze[y][(x + 1)].isWall()))) {
        return Main.maze[y][(x + 1)].getPheromone();
    }
    return 0;
}