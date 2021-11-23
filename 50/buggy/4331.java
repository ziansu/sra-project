@java.lang.Override
public void onChanged() {
    if ((mSwipeableView) != null) {
        if (mSwipeStarted) {
            mRestorePosition = mSwipeablePosition;
        }
        mSwipeableView.swipeStateReset();
        mSwipeableView = null;
    }
}