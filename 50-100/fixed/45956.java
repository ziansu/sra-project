public void setGridPosition(int player, int x, int z) {
    grid[z][(x + 2)] = player;
    if (x < 2) {
        grid[z][(x + 2)] = player;
    }else
        if (x > ((it.unibo.ai.didattica.mulino.domain.MillMinimax.X_SIZE) - 2)) {
            grid[z][(x + 2)] = player;
        }
    
}