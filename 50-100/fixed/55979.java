public void clearMarker(antgameproject.Pos markerPos, antgameproject.Colour markerCol, int mark) {
    for (antgameproject.Colour col : antgameproject.Colour.values()) {
        if (markerCol == col) {
            int markInTile = board[markerPos.getPosY()][markerPos.getPosX()].getMarker(col);
            if (markInTile == mark) {
                board[markerPos.getPosY()][markerPos.getPosX()].setMarker(col, null);
            }
        }
    }
}