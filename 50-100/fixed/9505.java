public boolean checkAnyMarker(antgameproject.Pos markerPos, antgameproject.Colour markerCol) {
    for (antgameproject.Colour col : antgameproject.Colour.values()) {
        if (markerCol == col) {
            return (board[markerPos.getPosY()][markerPos.getPosX()].getMarker(col)) != null;
        }
    }
    return false;
}