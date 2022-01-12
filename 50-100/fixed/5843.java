@java.lang.Override
public void setForegroundGravity(int foregroundGravity) {
    if ((mForegroundGravity) != foregroundGravity) {
        mForegroundBoundsChanged = true;
        if ((foregroundGravity & (android.view.Gravity.RELATIVE_HORIZONTAL_GRAVITY_MASK)) == 0) {
            foregroundGravity |= android.view.Gravity.START;
        }
        if ((foregroundGravity & (android.view.Gravity.VERTICAL_GRAVITY_MASK)) == 0) {
            foregroundGravity |= android.view.Gravity.TOP;
        }
        mForegroundGravity = foregroundGravity;
        requestLayout();
    }
}