public int getRemainingTries() {
    return ((Game.MAX_MISSES) + 1) - (misses.length());
}