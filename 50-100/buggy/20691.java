@java.lang.Override
public void setKeyboard(final com.android.inputmethod.keyboard.Keyboard keyboard) {
    super.setKeyboard(keyboard);
    if (com.android.inputmethod.accessibility.AccessibilityUtils.getInstance().isAccessibilityEnabled()) {
        mAccessibilityDelegate = new com.android.inputmethod.accessibility.MoreSuggestionsAccessibilityDelegate(this, mKeyDetector);
        mAccessibilityDelegate.setOpenAnnounce(R.string.spoken_open_more_suggestions);
        mAccessibilityDelegate.setCloseAnnounce(R.string.spoken_close_more_suggestions);
    }
}