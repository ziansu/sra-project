@java.lang.Override
public void onDetachedFromWindow() {
    super.onDetachedFromWindow();
    if ((mInsetBackground) != null) {
        mInsetBackground.setCallback(null);
    }
}