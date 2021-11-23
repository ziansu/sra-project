public void clearMarker(antgameproject.Pos markerPos, antgameproject.Colour markerCol, antgameproject.Marker mark) {
    for (antgameproject.Colour col : antgameproject.Colour.values()) {
        if (markerCol == col) {
            antgameproject.Marker markInTile = board[markerPos.getPosY()][markerPos.getPosX()].getMarker(col);
            if (markInTile == mark) {
                board[markerPos.getPosY()][markerPos.getPosX()].setMarker(col, Marker.EMPTY);
            }
        }
    }
}