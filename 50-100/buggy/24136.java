public int getCurrentPosition() {
    switch (mState) {
        case systems.byteswap.publicstream.MediaService.MEDIA_STATE_PLAYING :
            try {
                int ret = systems.byteswap.publicstream.MediaService.safeLongToInt(mMediaPlayer.getTime());
                return ret;
            } catch (java.lang.NullPointerException e) {
                return 0;
            }
        case systems.byteswap.publicstream.MediaService.MEDIA_STATE_PAUSED :
            return -2;
        default :
            return -1;
    }
}