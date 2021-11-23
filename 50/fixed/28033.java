private void scanInternalSubtitleTracks() {
    setSubtitleAnchor();
    populateInbandTracks();
    if ((mSubtitleController) != null) {
        mSubtitleController.selectDefaultTrack();
    }
}