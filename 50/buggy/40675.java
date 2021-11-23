public java.lang.String modifyListItem(com.mymusic.mymusicapp.model.SongDetails song) {
    com.mymusic.mymusicapp.model.SongDetails updatedSong = com.mymusic.mymusicapp.model.SongDetails.findById(com.mymusic.mymusicapp.model.SongDetails.class, song.getId());
    updatedSong = song;
    updatedSong.save();
    return "Song was modified in the db!";
}