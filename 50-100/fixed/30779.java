private boolean isMovingAhead(int player, java.awt.Point beginPoint, java.awt.Point endPoint) {
    boolean isMovingAhead = false;
    java.awt.Point rightClosestCellPoint = getPlayerRightClosestPoint(player);
    if ((java.lang.Math.abs(((beginPoint.y) - (rightClosestCellPoint.y)))) < (java.lang.Math.abs(((endPoint.y) - (rightClosestCellPoint.y))))) {
        isMovingAhead = true;
    }
    return isMovingAhead;
}