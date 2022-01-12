private void initContents() {
    assurePlayerInit();
    if ((mPlayer) != null) {
        mFirstName.setText(mPlayer.getFirstName());
        mLastInitial.setText(mPlayer.getLastInitial());
        mSelectedAvatar = mPlayer.getAvatar();
    }
}