private void chaiHongbao() {
    java.lang.System.out.println("chaiHongbao");
    android.view.accessibility.AccessibilityNodeInfo nodeInfo = getRootInActiveWindow();
    if (nodeInfo == null) {
        java.lang.System.out.println("rootWindow为空");
        return ;
    }
    java.util.List<android.view.accessibility.AccessibilityNodeInfo> list = nodeInfo.findAccessibilityNodeInfosByText("Open");
    if ((list.size()) == 0) {
        list = nodeInfo.findAccessibilityNodeInfosByText("拆红包");
    }
    for (android.view.accessibility.AccessibilityNodeInfo n : list) {
        n.performAction(AccessibilityNodeInfo.ACTION_CLICK);
    }
}