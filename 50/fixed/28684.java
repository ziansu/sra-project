@java.lang.Override
public void setPlaylist(java.util.ArrayList<ru.technotrack.music.model.Track> playlist) {
    if (!(playlist.equals(mPlaylist))) {
        mPlaylist = playlist;
        mIsTrackPrepared = false;
    }
}