private boolean isHorizontalMoveArea(float x, float y) {
    return ((mDisableWhenHorizontalMove) || ((mHorizontalMoveArea) == null)) || (mHorizontalMoveArea.isHorizontalMoveArea(x, y));
}