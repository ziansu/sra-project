@java.lang.Override
public void onFocusChange(android.view.View v, boolean hasFocus) {
    if (onFocusListener != null) {
        if (hasFocus) {
            performClick();
            clearFocus();
        }
        mHasFocus = hasFocus;
        onFocusListener.onFocusChanged(hasFocus);
    }
}