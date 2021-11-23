public static com.kabouzeid.gramophone.model.lyrics.Lyrics parse(com.kabouzeid.gramophone.model.Song song, java.lang.String data) {
    for (java.lang.Class<? extends com.kabouzeid.gramophone.model.lyrics.Lyrics> format : com.kabouzeid.gramophone.model.lyrics.Lyrics.FORMATS) {
        try {
            com.kabouzeid.gramophone.model.lyrics.Lyrics lyrics = format.newInstance().setData(song, data);
            if (lyrics.isValid())
                return lyrics.parse(false);
            
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }
    return new com.kabouzeid.gramophone.model.lyrics.Lyrics().setData(song, data).parse(false);
}