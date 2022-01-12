public double checkEast() {
    int x = this.getX();
    if ((!(x == (Main.endCoord[0]))) && (!(Main.maze[y][(x + 1)].isWall()))) {
        return Main.maze[y][(x + 1)].getPheromone();
    }
    return 0;
}