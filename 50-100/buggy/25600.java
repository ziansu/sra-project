public double checkSouth() {
    int y = this.getY();
    if ((!(y == (Main.beginCoord[1]))) && (!(Main.maze[(y - 1)][x].isWall()))) {
        return Main.maze[(y - 1)][x].getPheromone();
    }
    return 0;
}