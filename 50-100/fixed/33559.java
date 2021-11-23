@java.lang.Override
public void removeSongFromPlaylist(greenapp.model.sound.Playlist playlist, greenapp.model.sound.Audio audio) {
    java.util.Set<greenapp.model.sound.Audio> audioList = playlist.getSounds();
    for (greenapp.model.sound.Audio a : audioList) {
        if (a.getId().equals(audio.getId())) {
            audioList.remove(a);
            break;
        }
    }
    playlist.setSounds(audioList);
    playlistDao.save(playlist);
    int d = 4;
}