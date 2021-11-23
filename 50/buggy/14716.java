public boolean isBarrier(int x, int y) {
    return (maze.getMaze()[x][(y + 1)]) == '%';
}