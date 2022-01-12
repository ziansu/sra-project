private void setupMenu() {
    android.view.MenuItem undoItem = mMenu.findItem(R.id.undoButton);
    android.view.MenuItem redoItem = mMenu.findItem(R.id.redoButton);
    android.view.MenuItem resetItem = mMenu.findItem(R.id.resetHistoryButton);
    mMasterImage.getHistory().setMenuItems(undoItem, redoItem, resetItem);
}