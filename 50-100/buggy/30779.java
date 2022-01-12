private boolean isMovingAhead(int player, java.awt.Point beginPoint, java.awt.Point endPoint) {
    boolean isMovingAhead = false;
    java.awt.Point rightClosestCellPoint = getPlayerRightClosestPoint(player);
    if ((java.lang.Math.abs(((beginPoint.x) - (rightClosestCellPoint.x)))) < (java.lang.Math.abs(((endPoint.x) - (rightClosestCellPoint.x))))) {
        isMovingAhead = true;
    }
    return isMovingAhead;
}