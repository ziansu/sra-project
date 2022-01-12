@java.lang.Override
public void onWindowFocusChanged(boolean hasWindowFocus) {
    super.onWindowFocusChanged(hasWindowFocus);
    if ((DEFAULT_THRESHOLD) > (getWidth())) {
        DEFAULT_THRESHOLD = (getWidth()) - (THRESHOLD_PADDING);
    }
}