@java.lang.Override
public void removeSongFromPlaylist(greenapp.model.sound.Playlist playlist, greenapp.model.sound.Audio audio) {
    java.util.Set<greenapp.model.sound.Audio> audioList = playlist.getSounds();
    for (greenapp.model.sound.Audio a : audioList) {
        if ((a.getId()) == (audio.getId())) {
            int r = 3;
            audioList.remove(a);
            break;
        }
    }
    playlist.setSounds(audioList);
    playlistDao.save(playlist);
    int d = 4;
}