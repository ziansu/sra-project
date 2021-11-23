public static android.view.accessibility.AccessibilityNodeInfo findNodeInfosById(android.view.accessibility.AccessibilityNodeInfo root, java.lang.String resId) {
    if ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.JELLY_BEAN_MR2)) {
        java.util.List<android.view.accessibility.AccessibilityNodeInfo> list = root.findAccessibilityNodeInfosByViewId(resId);
        if ((list != null) && (list.isEmpty())) {
            return list.get(0);
        }
    }
    return null;
}