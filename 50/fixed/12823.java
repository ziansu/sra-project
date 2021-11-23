@java.lang.Override
public greenapp.model.sound.Playlist getPlaylistById(long id) {
    return playlistDao.findById(id);
}