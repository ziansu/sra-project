public void setForegroundGravity(int foregroundGravity) {
    if ((mForegroundGravity) != foregroundGravity) {
        if ((foregroundGravity & (android.view.Gravity.RELATIVE_HORIZONTAL_GRAVITY_MASK)) == 0) {
            foregroundGravity |= android.view.Gravity.START;
        }
        if ((foregroundGravity & (android.view.Gravity.VERTICAL_GRAVITY_MASK)) == 0) {
            foregroundGravity |= android.view.Gravity.TOP;
        }
        mForegroundGravity = foregroundGravity;
        mForegroundBoundsChanged = true;
        requestLayout();
    }
}