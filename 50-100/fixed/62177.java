@java.lang.Override
public void updateCheckFlag() {
    com.pawello2222.chess.service.PieceColor opponentColor = com.pawello2222.chess.service.PieceLogic.getOppositePieceColor(sourcePiece.getColor());
    com.pawello2222.chess.service.Spot kingSpot = getKingSpot(opponentColor);
    if ((kingSpot != null) && (isSpotCapturable(kingSpot, opponentColor)))
        kingSpot.setCheckFlag(true);
    
}