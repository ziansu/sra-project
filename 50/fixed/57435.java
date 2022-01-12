private static void handleViewFocused(android.view.accessibility.AccessibilityEvent event, android.view.accessibility.AccessibilityNodeInfo view) {
    if (view != null) {
        if (view.isFocused()) {
            org.nbp.b2g.ui.ScreenMonitor.setCurrentNode(event);
        }
    }
}