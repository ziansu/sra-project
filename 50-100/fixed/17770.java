private static java.lang.String setGenre(java.lang.String rawGenre) {
    if (rawGenre == null) {
        return null;
    }
    java.lang.String genreName = rawGenre;
    java.util.regex.Matcher m = com.perrier.music.tag.Mp3Tag.GENRE_ID_TO_NAME_PATTERN.matcher(genreName);
    if (m.matches()) {
        int genreId = java.lang.Integer.parseInt(m.group(1));
        java.lang.String realGenre = org.jaudiotagger.tag.reference.GenreTypes.getInstanceOf().getValueForId(genreId);
        if (realGenre != null) {
            genreName = realGenre;
        }
    }
    return genreName;
}