@java.lang.Override
public void onWindowFocusChanged(boolean hasWindowFocus) {
    super.onWindowFocusChanged(hasWindowFocus);
    if ((DEFAULT_THRESHOLD) > (editText.getWidth())) {
        DEFAULT_THRESHOLD = (editText.getWidth()) - (THRESHOLD_PADDING);
    }
}