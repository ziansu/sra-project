public boolean playTrack(int trackNum) {
    mCurrentPlaylist = new com.notime2wait.simpleplayer.MusicData.Playlist();
    mCurrentPlaylist.add(mTracks[trackNum]);
    mCurrentPlaylist.setCurrentTrackIndex(0);
    mPlaylistHistory.addLast(mCurrentPlaylist);
    mHistoryIndex = (mPlaylistHistory.size()) - 1;
    return mMainActivity.playTrack(mTracks[trackNum]);
}