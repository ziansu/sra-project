public void playSong() {
    if ((mState) == (org.williamwong.spotifystreamer.services.MusicService.State.PAUSED)) {
        mMediaPlayer.start();
        return ;
    }
    if ((mState) == (org.williamwong.spotifystreamer.services.MusicService.State.PLAYING)) {
        stopSong();
    }
    try {
        mMediaPlayer.setDataSource(mTrackModels.get(mCurrentTrack).getPreviewUrl());
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    mMediaPlayer.prepareAsync();
    mState = org.williamwong.spotifystreamer.services.MusicService.State.PREPARING;
}