public boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent event) {
    boolean ret = super.dispatchPopulateAccessibilityEvent(event);
    if ((mPluginActivity) != null) {
        mPluginActivity.dispatchPopulateAccessibilityEvent(event);
    }
    return ret;
}