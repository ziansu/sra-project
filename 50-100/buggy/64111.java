@java.lang.Override
public void setPlayList(java.util.ArrayList<com.company.integer.vkmusic.pojo.MusicTrackPOJO> tracks, int position) {
    if (((tracks.size()) != 0) & ((tracks.size()) > (currentTrackPosition))) {
        playlist = tracks;
        currentTrackPosition = position;
        currentTrackTime = 0;
        currentTrack = playlist.get(currentTrackPosition);
        musicPlayerListener.onCurrentTrackChanged(currentTrack);
        android.util.Log.d(LOG_TAG, ("Set playlist length :" + (playlist.size())));
    }
}