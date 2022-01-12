@java.lang.Override
public void setKeyboard(final com.android.inputmethod.keyboard.Keyboard keyboard) {
    super.setKeyboard(keyboard);
    if (com.android.inputmethod.accessibility.AccessibilityUtils.getInstance().isAccessibilityEnabled()) {
        if (!((mAccessibilityDelegate) instanceof com.android.inputmethod.accessibility.MoreSuggestionsAccessibilityDelegate)) {
            mAccessibilityDelegate = new com.android.inputmethod.accessibility.MoreSuggestionsAccessibilityDelegate(this, mKeyDetector);
            mAccessibilityDelegate.setOpenAnnounce(R.string.spoken_open_more_suggestions);
            mAccessibilityDelegate.setCloseAnnounce(R.string.spoken_close_more_suggestions);
        }
        mAccessibilityDelegate.setKeyboard(keyboard);
    }
}