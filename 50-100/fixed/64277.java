public void clearMaze(int x, int y) {
    maze = new char[y][x];
    for (int i = 0; i < y; i++) {
        for (int j = 0; j < x; j++) {
            maze[i][j] = '#';
        }
    }
}