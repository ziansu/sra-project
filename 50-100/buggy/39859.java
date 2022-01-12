public void setMarker(antgameproject.Pos markerPos, antgameproject.Colour markerCol, antgameproject.Marker mark) {
    for (antgameproject.Colour col : antgameproject.Colour.values()) {
        if (markerCol == col) {
            board[markerPos.getPosY()][markerPos.getPosX()].setMarker(markerCol, mark);
        }
    }
}