public static models.SongBook getDefaultSongbook(models.UserAccount user) {
    models.SongBook defaultSongbook = models.SongBook.get(1L);
    if (defaultSongbook == null) {
        defaultSongbook = new models.SongBook();
        defaultSongbook.setId(models.SongBook.DEFAULT_SONGBOOK_ID);
        defaultSongbook.setSongBookName("default");
        defaultSongbook.setPrivateSongbook(false);
        defaultSongbook.setUser(user);
        defaultSongbook.save();
    }
    return defaultSongbook;
}