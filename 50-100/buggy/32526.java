@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    connectFailDialog.setListener(null);
    updateDialog.setListener(null);
    xWalkView.clearCache(true);
    if ((xWalkView) != null) {
        xWalkView.onDestroy();
    }
}