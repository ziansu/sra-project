@java.lang.Override
public void onAnimationEnd() {
    if ((endState) != (com.ytjojo.viewlib.supernestedlayout.BottomSheetBehavior.STATE_UNKNOWN)) {
        behavior.setStateInternal(endState);
    }
    endState = com.ytjojo.viewlib.supernestedlayout.BottomSheetBehavior.STATE_UNKNOWN;
}