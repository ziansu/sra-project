public java.lang.String deleteSong(long id) {
    com.mymusic.mymusicapp.model.SongDetails song = com.mymusic.mymusicapp.model.SongDetails.findById(com.mymusic.mymusicapp.model.SongDetails.class, id);
    song.delete();
    return "Song was deleted from the db!";
}