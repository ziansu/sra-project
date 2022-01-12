@android.support.annotation.MainThread
public void notifyPlaylistChanged() {
    android.util.Log.d(org.bottiger.podcast.playlist.Playlist.TAG, "notifyPlaylistChanged");
    org.bottiger.podcast.SoundWaves.getRxBus().send(this);
}