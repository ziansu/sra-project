@java.lang.Override
protected ContextMenu.ContextMenuInfo getContextMenuInfo() {
    popMenu = true;
    return new peter.util.searcher.view.SearchWebView.ContextMenuInfo(getHitTestResult(), touchX, touchY);
}