private boolean haveOtherNoMoves(modell.HumanPlayer otherPlayer, java.util.ArrayList<modell.Piece> boardPieces, java.util.ArrayList<modell.Position> freePos) {
    int noOfChoices = 0;
    java.util.ArrayList<modell.Piece> piecesOnBoard = getListPiecesOfColor(otherPlayer.isBlack(), boardPieces);
    for (modell.Piece p : piecesOnBoard) {
        noOfChoices += getOptionMove(freePos, p).size();
    }
    return noOfChoices == 0;
}