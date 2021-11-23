@java.lang.Override
public boolean performLongClick() {
    return ((java.lang.Math.abs(getScrollX())) <= (mScaleTouchSlop)) && (super.performLongClick());
}