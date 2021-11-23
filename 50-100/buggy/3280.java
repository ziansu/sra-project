public static boolean isFilePatternValid() {
    java.lang.String pattern = MovieModuleManager.MOVIE_SETTINGS.getMovieRenamerFilename().toUpperCase().trim();
    if ((pattern.isEmpty()) || (((pattern.contains("$T")) || (pattern.contains("$E"))) || (pattern.contains("$O")))) {
        return true;
    }
    return false;
}