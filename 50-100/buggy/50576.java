private void syncCheckStates() {
    for (int i = 0; i < (mItems.length); i++) {
        mItems[i].setChecked(((mOldReactionIds[i]) != 0));
    }
    updateDrawableState();
}