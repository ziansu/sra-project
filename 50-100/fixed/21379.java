public double checkWest() {
    int x = this.getX();
    if ((x != 0) && (!(Main.maze[y][(x - 1)].isWall()))) {
        return Main.maze[y][(x - 1)].getPheromone();
    }
    return 0;
}