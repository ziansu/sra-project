private void destroyLines() {
    int line = 0;
    for (int row = 0; row < (wall.length); row++) {
        if (isRowFull(row))
            deleteRow(row);
        
        line++;
    }
    this.lines += line;
    this.score += xtq.game.tetris.Tetris.SCORE_TABLE[line];
}