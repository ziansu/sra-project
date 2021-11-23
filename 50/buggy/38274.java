boolean isSilver(android.graphics.Point p) {
    if (board.isEmpty(p)) {
        return false;
    }
    return (board.getColour(p)) == (email.com.gmail.songjiapei.arimaa.Piece.PieceColour.SILVER);
}