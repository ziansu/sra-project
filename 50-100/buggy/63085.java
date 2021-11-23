public java.lang.String allMovies() {
    java.lang.String allMovies = "\nID | Name | Year | Director | Rating\n";
    java.lang.Integer count = 0;
    for (com.twu.biblioteca.Movie movie : movies) {
        if (movie.isAvailable()) {
            allMovies += (((count++) + " | ") + (movie.getDetailsSeparatedBy(" | "))) + "\n";
        }
    }
    return allMovies;
}