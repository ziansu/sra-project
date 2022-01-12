private void initContents() {
    assurePlayerInit();
    if (null != (mPlayer)) {
        mFirstName.setText(mPlayer.getFirstName());
        mLastInitial.setText(mPlayer.getLastInitial());
        mSelectedAvatar = mPlayer.getAvatar();
    }
}