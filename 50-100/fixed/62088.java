private static void setTraktId(com.moviejukebox.scanner.Ids ids, java.lang.String presentTraktId, com.moviejukebox.model.Movie movie) {
    if ((presentTraktId == null) && ((ids.trakt()) != null)) {
        movie.setId(TraktTV.SCANNER_ID, ids.trakt().toString());
    }
}