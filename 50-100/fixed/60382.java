public void touchMove(float x, float y) {
    float dx = java.lang.Math.abs(((mLastX) - x));
    float dy = java.lang.Math.abs(((mLastY) - y));
    if ((dx >= (org.kore.kolabnotes.android.draweditor.Line.TOUCH_TOLERANCE)) || (dy >= (org.kore.kolabnotes.android.draweditor.Line.TOUCH_TOLERANCE))) {
        quadTo(mLastX, mLastY, (((mLastX) + x) / 2), (((mLastY) + y) / 2));
        mLastX = x;
        mLastY = y;
    }
}