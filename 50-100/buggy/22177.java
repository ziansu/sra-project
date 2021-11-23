public java.util.List<net.toracode.moviedb.entities.Movie> removeFromList(java.util.List<net.toracode.moviedb.entities.Movie> movieList, net.toracode.moviedb.entities.Movie movie) {
    try {
        for (int i = 0; i < (movieList.size()); i++) {
            if ((movieList.get(i).getUniqueId()) == (movie.getUniqueId()))
                movieList.remove(i);
            
        }
    } catch (java.lang.Exception e) {
    }
    return movieList;
}