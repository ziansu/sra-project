public void run() {
    mIsLongpressed = true;
    if (isPressed()) {
        if (isLongClickable()) {
            performLongClick();
        }else {
            sendEvent(KeyEvent.ACTION_DOWN, KeyEvent.FLAG_LONG_PRESS);
            sendAccessibilityEvent(AccessibilityEvent.TYPE_VIEW_LONG_CLICKED);
        }
        setHapticFeedbackEnabled(true);
    }
}