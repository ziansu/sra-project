private void setGridPosition(int player, int x, int z) {
    grid[z][(x + 2)] = player;
    if (x < 2) {
        grid[z][(((it.unibo.ai.didattica.mulino.domain.MillMinimax.X_SIZE) + x) + 2)] = it.unibo.ai.didattica.mulino.domain.MillMinimax.FREE;
    }else
        if (x > ((it.unibo.ai.didattica.mulino.domain.MillMinimax.X_SIZE) - 2)) {
            grid[z][(((it.unibo.ai.didattica.mulino.domain.MillMinimax.X_SIZE) + x) + 2)] = it.unibo.ai.didattica.mulino.domain.MillMinimax.FREE;
        }
    
}