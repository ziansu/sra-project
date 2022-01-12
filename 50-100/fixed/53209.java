private void undoHistory() {
    if ((mHistory.size()) > 0) {
        com.sleepyduck.pixelate4crafting.control.util.history.History hist = mHistory.pop();
        mUndoneHistory.add(hist);
        hist.undo(mDoHistory);
    }
    if ((mHistory.size()) == 0) {
        mOptionMenu.findItem(R.id.menu_item_undo).setEnabled(false);
    }
    if ((mUndoneHistory.size()) == 1) {
        mOptionMenu.findItem(R.id.menu_item_redo).setEnabled(true);
    }
}