public void gameOver() {
    m_game.reset();
    for (int r = 0; r < (Game.NUM_ROWS); r++) {
        for (int c = 0; c < (m_numCols); c++)
            m_map[r][c] = null;
        
    }
    parseMapFile();
}