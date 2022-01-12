@java.lang.Override
public void run(com.topoinventari.movies.MoviesConfiguration configuration, io.dropwizard.setup.Environment environment) {
    com.topoinventari.movies.services.MovieService movieService = new com.topoinventari.movies.services.MovieService();
    com.topoinventari.movies.services.RentalService rentalService = new com.topoinventari.movies.services.RentalService();
    com.topoinventari.movies.services.UserService userService = new com.topoinventari.movies.services.UserService();
    com.topoinventari.movies.controllers.MovieApi movieApi = new com.topoinventari.movies.controllers.MovieApi(movieService);
    com.topoinventari.movies.controllers.RentalApi rentalApi = new com.topoinventari.movies.controllers.RentalApi(rentalService);
    environment.jersey().register(movieApi);
    environment.jersey().register(rentalApi);
}