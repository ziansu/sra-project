public void createSongBook() throws java.lang.Exception {
    uk.me.richardcook.sessionography.model.BookFile file = new uk.me.richardcook.sessionography.model.BookFile("song.tex", getBookStrings());
    file.setUpDocument(file.getBookString("song-subtitle"), false);
    bookSongService.generateSongs(file);
    file.endDocument();
    file.closeFile();
}