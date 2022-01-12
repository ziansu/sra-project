private boolean checkCheck(Enums.PieceColor color) {
    java.util.List<java.awt.Point> attackedSquares = getAttackedSquares(color);
    boolean returnValue = false;
    if ((color == (Enums.PieceColor.White)) && (attackedSquares.contains(blackKing.getLocation()))) {
        returnValue = true;
    }else
        if ((color == (Enums.PieceColor.Black)) && (attackedSquares.contains(whiteKing.getLocation()))) {
            returnValue = true;
        }
    
    return returnValue;
}