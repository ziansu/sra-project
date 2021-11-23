@java.lang.Override
public boolean performLongClick() {
    if ((java.lang.Math.abs(getScrollX())) > (mScaleTouchSlop)) {
        return false;
    }
    return super.performLongClick();
}