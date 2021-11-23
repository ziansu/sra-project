public boolean isInScreen() {
    return (((((mPoint_X) - (mRadius)) > (mTargetCanvasWidth)) || (((mPoint_Y) - (mRadius)) > (mTargetCanvasHeight))) || (((mPoint_X) + (mRadius)) < 0)) || (((mPoint_Y) + (mRadius)) < 0);
}