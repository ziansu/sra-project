private boolean canDragVertically(int directionY) {
    if (!(mPreviewEnabled)) {
        return false;
    }
    getDisplayRect(mTempRectF);
    if (directionY > 0) {
        return (mTempRectF.top) < 0;
    }else {
        return (mTempRectF.bottom) > (getHeight());
    }
}