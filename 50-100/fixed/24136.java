public int getCurrentPosition() {
    switch (mState) {
        case systems.byteswap.publicstream.MediaService.MEDIA_STATE_PLAYING :
            try {
                return systems.byteswap.publicstream.MediaService.safeLongToInt(mMediaPlayer.getTime());
            } catch (java.lang.NullPointerException e) {
                return 0;
            }
        case systems.byteswap.publicstream.MediaService.MEDIA_STATE_PAUSED :
            return -2;
        default :
            return -1;
    }
}