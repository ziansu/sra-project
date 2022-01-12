protected void makeGrid(char[][] map, int width, int height, nl.tudelft.jpacman.board.Square[][] grid, java.util.List<nl.tudelft.jpacman.npc.NPC> ghosts, java.util.List<nl.tudelft.jpacman.board.Square> startPositions) {
    for (int x = 0; x < width; x++) {
        for (int y = 0; y < height; y++) {
            char c = map[x][y];
            addSquare(grid, ghosts, startPositions, x, y, c);
        }
    }
}