private int getDefaultTrackIndex(java.util.List<? extends com.kaltura.playkit.player.BaseTrack> trackList, java.lang.String lastSelectedTrackId) {
    int defaultTrackIndex = 0;
    if (trackList.isEmpty()) {
        return defaultTrackIndex;
    }
    for (int i = 0; i < (trackList.size()); i++) {
        if ((trackList.get(i).getSelectionFlag()) == (com.kaltura.playkit.utils.Consts.DEFAULT_TRACK_SELECTION_FLAG)) {
            defaultTrackIndex = i;
        }
    }
    return restoreLastSelectedTrack(trackList, lastSelectedTrackId, defaultTrackIndex);
}