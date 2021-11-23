@java.lang.Override
public void onAttachedToWindow() {
    super.onAttachedToWindow();
    if ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.LOLLIPOP)) {
        requestApplyInsets();
    }
    if ((mInsetBackground) != null) {
        mInsetBackground.setCallback(this);
    }
}