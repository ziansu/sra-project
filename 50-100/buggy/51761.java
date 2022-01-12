private void addHistory(com.sleepyduck.pixelate4crafting.control.util.history.History hist) {
    mHistory.add(hist);
    if ((mHistory.size()) == 1) {
        mOptionMenu.findItem(R.id.menu_item_undo).setVisible(true);
    }
    if ((mUndoneHistory.size()) > 0) {
        mUndoneHistory.clear();
        mOptionMenu.findItem(R.id.menu_item_redo).setVisible(false);
    }
}