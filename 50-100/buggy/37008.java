@com.squareup.otto.Subscribe
public void onLoadedMoviesEvent(com.example.vit.popularmovies.communication.Event.LoadedMoviesEvent event) {
    com.example.vit.popularmovies.rest.model.Page page = event.getPage();
    if (page.isStartingPage()) {
        android.util.Log.d(MovieApplication.TAG, ((com.example.vit.popularmovies.ui.fragment.MoviesGridFragment.CLASS) + "set new data"));
        adapter.setData(page.getMovies());
    }else {
        android.util.Log.d(MovieApplication.TAG, ((com.example.vit.popularmovies.ui.fragment.MoviesGridFragment.CLASS) + "add new data "));
        adapter.addData(page.getMovies());
        this.moviesList.addAll(page.getMovies());
    }
}