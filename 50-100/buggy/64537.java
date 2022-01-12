public double checkNorth() {
    int y = this.getY();
    if ((!(y == (Main.endCoord[1]))) && (!(Main.maze[(y + 1)][x].isWall()))) {
        return Main.maze[(y + 1)][x].getPheromone();
    }
    return 0;
}