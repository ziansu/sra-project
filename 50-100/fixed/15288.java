public void play() {
    try {
        if ((mPlayer) == null) {
            mPlayer = new android.media.MediaPlayer();
        }
        mPlayer.setDataSource(mSource);
        mPlayer.setOnPreparedListener(new android.media.MediaPlayer.OnPreparedListener() {
            @java.lang.Override
            public void onPrepared(android.media.MediaPlayer mediaPlayer) {
                mPlayer.start();
                mPlayStatus = com.shonshampain.streamrecorder.services.StreamPlayerService.PlayStatus.Playing;
            }
        });
        mPlayer.prepareAsync();
    } catch (java.io.IOException e) {
        android.util.Log.e(com.shonshampain.streamrecorder.services.StreamPlayerService.TAG, "MediaPlayer failed");
    }
}