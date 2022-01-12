private java.util.List<android.view.accessibility.AccessibilityNodeInfo> findAccessibilityNodeInfosByTexts(android.view.accessibility.AccessibilityNodeInfo nodeInfo, java.lang.String[] texts) {
    for (java.lang.String text : texts) {
        java.util.List<android.view.accessibility.AccessibilityNodeInfo> nodes = nodeInfo.findAccessibilityNodeInfosByText(text);
        if (!(nodes.isEmpty())) {
            if ((text.equals(this.WECHAT_OPEN_EN)) && (!(nodeInfo.findAccessibilityNodeInfosByText(this.WECHAT_OPENED_EN).isEmpty()))) {
                continue;
            }
            return nodes;
        }
    }
    return new java.util.ArrayList<>();
}