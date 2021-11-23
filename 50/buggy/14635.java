@java.lang.Override
public void onAnimationEnd() {
    if ((endState) != (com.ytjojo.viewlib.supernestedlayout.BottomSheetBehavior.STATE_UNKNOWN)) {
        behavior.mViewOffsetHelper.getTopAndBottomOffset();
        behavior.setStateInternal(endState);
    }
    endState = com.ytjojo.viewlib.supernestedlayout.BottomSheetBehavior.STATE_UNKNOWN;
}