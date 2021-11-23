public java.util.List<java.lang.String> getGenres() {
    java.lang.String genres = this.genres;
    return java.util.Collections.unmodifiableList(java.util.Arrays.asList(genres.split(com.jonasgerdes.schauburgr.model.Movie.STRING_LIST_SEPERATOR)));
}