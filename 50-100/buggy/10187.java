public boolean move(boolean[][] game, int pos, boolean player) {
    if ((game[(!player ? 1 : 0)][(pos - 1)]) && (game[(player ? 1 : 0)][(pos - 1)]))
        return true;
    
    return false;
}