public boolean isValid(com.player.Position p) {
    return ((((p.x) >= 0) && ((p.x) < (row))) && ((p.y) >= 0)) && ((p.y) < (column));
}