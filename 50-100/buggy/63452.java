private boolean checkCheck(Enums.PieceColor color) {
    java.util.List<java.awt.Point> attackedSquares = getAttackedSquares(color);
    boolean returnValue = false;
    if ((color == (Enums.PieceColor.White)) && (attackedSquares.contains(blackKing.getLocation()))) {
        returnValue = true;
        java.lang.System.out.println("CHECK");
    }else
        if ((color == (Enums.PieceColor.Black)) && (attackedSquares.contains(whiteKing.getLocation()))) {
            returnValue = true;
            java.lang.System.out.println("CHECK");
        }
    
    return returnValue;
}