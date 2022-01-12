public Board dupBoard() {
    int N = this.tiles.length;
    int[][] newTiles = new int[N][N];
    for (int i = 0; i < N; i++) {
        for (int j = 0; j < N; j++)
            newTiles[i][j] = this.tiles[i][j];
        
    }
    return new Board(newTiles);
}