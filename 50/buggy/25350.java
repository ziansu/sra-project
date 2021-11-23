private void pausePlayer() {
    mPosition = mPlayer.getCurrentPosition();
    mPlayer.pause();
    mIsPlayingText.setText(getResources().getString(R.string.off));
}