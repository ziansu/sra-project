public void setData(com.neiljaywarner.yamoviesapp.model.MoviePage moviePage) {
    if (moviePage != null) {
        movies = moviePage.getMovies();
        this.notifyDataSetChanged();
    }
}