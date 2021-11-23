private boolean hasOneOfThoseNodes(java.lang.String... texts) {
    for (java.lang.String text : texts) {
        if (text == null)
            continue;
        
        java.util.List<android.view.accessibility.AccessibilityNodeInfo> nodes = this.rootNodeInfo.findAccessibilityNodeInfosByText(text);
        if (!(nodes.isEmpty()))
            return true;
        
    }
    return false;
}