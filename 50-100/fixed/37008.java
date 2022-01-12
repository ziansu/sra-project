@com.squareup.otto.Subscribe
public void onLoadedMoviesEvent(com.example.vit.popularmovies.communication.Event.LoadedMoviesEvent event) {
    com.example.vit.popularmovies.rest.model.Page page = event.getPage();
    if (page.isStartingPage()) {
        adapter.setData(page.getMovies());
    }else {
        adapter.addData(page.getMovies());
        this.moviesList.addAll(page.getMovies());
    }
}