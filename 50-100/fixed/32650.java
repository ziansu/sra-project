private boolean hasOneOfThoseNodes(java.lang.String... texts) {
    java.util.List<android.view.accessibility.AccessibilityNodeInfo> nodes;
    for (java.lang.String text : texts) {
        if (text == null)
            continue;
        
        nodes = this.rootNodeInfo.findAccessibilityNodeInfosByText(text);
        if ((nodes != null) && (!(nodes.isEmpty())))
            return true;
        
    }
    return false;
}