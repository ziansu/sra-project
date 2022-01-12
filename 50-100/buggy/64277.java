public void clearMaze(Point size) {
    maze = new char[size.getY()][size.getX()];
    for (int i = 0; i < (size.getY()); i++) {
        for (int j = 0; j < (size.getX()); j++) {
            maze[i][j] = '#';
        }
    }
}