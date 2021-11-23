@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    if ((connectFailDialog) != null) {
        connectFailDialog.setListener(null);
    }
    if ((updateDialog) != null) {
        updateDialog.setListener(null);
    }
    xWalkView.clearCache(true);
    if ((xWalkView) != null) {
        xWalkView.onDestroy();
    }
}