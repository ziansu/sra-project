private void redoHistory() {
    if ((mUndoneHistory.size()) > 0) {
        com.sleepyduck.pixelate4crafting.control.util.history.History hist = mUndoneHistory.pop();
        mHistory.add(hist);
        hist.redo(mDoHistory);
    }
    if ((mHistory.size()) == 1) {
        mOptionMenu.findItem(R.id.menu_item_undo).setVisible(true);
    }
    if ((mUndoneHistory.size()) == 0) {
        mOptionMenu.findItem(R.id.menu_item_redo).setVisible(false);
    }
}