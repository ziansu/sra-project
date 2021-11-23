public java.lang.Integer numberOfMovies() {
    try {
        return this.movies.size();
    } catch (java.lang.NullPointerException ex) {
        return 0;
    }
}