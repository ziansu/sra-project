@java.lang.Override
public void call(java.util.List<com.lennonwoo.rubber.data.model.local.Song> songs) {
    updatePlaylist(songs, position);
    view.changeSong();
}