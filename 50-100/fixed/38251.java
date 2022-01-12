@java.lang.Override
public com.frygo.movieflix.movie.entity.Movie create(com.frygo.movieflix.movie.entity.Movie movie) {
    com.frygo.movieflix.movie.entity.Movie existing = respository.findByTitle(movie.getTitle());
    if (existing != null) {
        throw new com.frygo.movieflix.exception.AlreadyExistsException((("Movie " + (movie.getTitle())) + " is already in use"));
    }
    return respository.create(movie);
}