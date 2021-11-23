private void scanInternalSubtitleTracks() {
    if ((mSubtitleController) == null) {
        android.util.Log.d(android.media.MediaPlayer.TAG, "setSubtitleAnchor in MediaPlayer");
        setSubtitleAnchor();
    }
    populateInbandTracks();
    if ((mSubtitleController) != null) {
        mSubtitleController.selectDefaultTrack();
    }
}