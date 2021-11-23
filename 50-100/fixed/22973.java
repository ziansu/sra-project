private boolean canMoveWithoutBeingChecked(java.util.ArrayList<pieces.piece.Piece> enemyPieces) {
    for (int i = 0; i < (chessboard.Utils.BOARD_LENGTH); i++) {
        for (int j = 0; j < (chessboard.Utils.BOARD_LENGTH); j++) {
            if (((canMove(i, j)) || (canCapture(i, j))) && (!(would_be_checked(enemyPieces, i, j))))
                return true;
            
        }
    }
    return false;
}