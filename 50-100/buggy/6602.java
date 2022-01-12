private Game.Piece getKing() {
    java.util.LinkedList<Game.Piece> pieces = Game.Player.state.getPieces(isWhite);
    for (int i = 0; i < (pieces.size()); i++) {
        if (5 == (pieces.get(i).getIdentifier())) {
            return pieces.get(i);
        }
    }
}