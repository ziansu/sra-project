@java.lang.Override
public void addGenres(java.util.Set<java.lang.String> genres) {
    if (genres == null)
        genres = new java.util.HashSet<>();
    
    movieDto.setGenres(new java.util.HashSet<>(genres));
}