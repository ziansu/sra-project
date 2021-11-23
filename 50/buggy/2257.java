private void promoteNextPlayer() {
    this.currentPlayer = ((currentPlayer) == (org.casestudy.target.chess.constants.PieceColor.White)) ? org.casestudy.target.chess.constants.PieceColor.Black : org.casestudy.target.chess.constants.PieceColor.White;
    if ((this.currentPlayer) == (org.casestudy.target.chess.constants.PieceColor.Black)) {
        (this.fullMoveCount)++;
    }
}