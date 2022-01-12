private void restorePosition() {
    mPosition = android.preference.PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).getInt(Constant.PRE_POSITION_VIDEO, 0);
    mMediaPlayer.start();
    mMediaPlayer.reset();
    disPlayVideo(mVideoUrl);
    mMediaPlayer.setOnCompletionListener(new android.media.MediaPlayer.OnCompletionListener() {
        @java.lang.Override
        public void onCompletion(android.media.MediaPlayer mp) {
            mMediaPlayer.seekTo(mPosition);
        }
    });
}