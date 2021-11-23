@java.lang.Override
public void onShowPress(android.view.MotionEvent e) {
    if ((mIsPrepressed) && ((mPressedView) != null)) {
        mIsShowPress = true;
    }
    super.onShowPress(e);
}