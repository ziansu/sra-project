private void resetAndSaveLayout() {
    if (((mLayout) instanceof android.text.BoringLayout) && ((mSavedLayout) == null)) {
        mSavedLayout = ((android.text.BoringLayout) (mLayout));
    }
    mBoring = null;
}