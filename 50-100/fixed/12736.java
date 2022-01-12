public java.util.List<com.mymusic.mymusicapp.model.SongDetails> listSongDetails(java.lang.String text) {
    java.util.List<com.mymusic.mymusicapp.model.SongDetails> values = new java.util.ArrayList<com.mymusic.mymusicapp.model.SongDetails>();
    if (text.equals("")) {
        values = com.mymusic.mymusicapp.model.SongDetails.listAll(com.mymusic.mymusicapp.model.SongDetails.class);
    }else {
        values = com.mymusic.mymusicapp.model.SongDetails.find(com.mymusic.mymusicapp.model.SongDetails.class, "title = ? or artist = ?", text, text);
    }
    return values;
}