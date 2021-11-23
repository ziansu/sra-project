private void resumePlayer() {
    mPlayer.seekTo(mPosition);
    mPlayer.start();
    mIsPlayingText.setText(getResources().getString(R.string.on));
}