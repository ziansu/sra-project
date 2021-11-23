private boolean canDragVertically(int directionY) {
    if (!(mPreviewEnabled)) {
        return false;
    }
    getDisplayRect(mTempRectF);
    if (directionY > 0) {
        return (java.lang.Math.round(mTempRectF.top)) < 0;
    }else {
        return (java.lang.Math.round(mTempRectF.bottom)) > (getHeight());
    }
}