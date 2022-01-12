private void syncCheckStates() {
    for (int i = 0; i < (mItems.length); i++) {
        mItems[i].setChecked((((mOldReactionIds) != null) && ((mOldReactionIds[i]) != 0)));
    }
    updateDrawableState();
}