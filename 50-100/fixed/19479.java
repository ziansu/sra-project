private void setEmptyMatrix() {
    qwirkle.tile.Tile tile = new qwirkle.tile.Tile(qwirkle.tile.Color.NONE, qwirkle.tile.Shape.NONE);
    for (int i = 0; i < ((Game.BOARD_COLUMS) - 1); i++)
        for (int j = 0; j < ((Game.BOARD_COLUMS) - 1); j++)
            matrix[i][j] = tile;
        
    
}