@java.lang.Override
public boolean onInfo(io.vov.vitamio.MediaPlayer mp, int what, int extra) {
    switch (what) {
        case io.vov.vitamio.MediaPlayer.MEDIA_INFO_BUFFERING_START :
            if (mVideoView.isPlaying()) {
                mVideoView.pause();
            }
            showLoading();
            break;
        case io.vov.vitamio.MediaPlayer.MEDIA_INFO_BUFFERING_END :
            hideLoading();
            mp.start();
            break;
    }
    return false;
}