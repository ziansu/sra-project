@java.lang.Override
public void onActivityCreated(android.os.Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    android.util.Log.d(MovieApplication.TAG, ((com.example.vit.popularmovies.ui.fragment.MoviesGridFragment.CLASS) + "onActivityCreated()"));
    if (savedInstanceState != null) {
        if (savedInstanceState.containsKey(com.example.vit.popularmovies.ui.fragment.MoviesGridFragment.KEY_MOVIES_LIST)) {
            moviesList = org.parceler.Parcels.unwrap(savedInstanceState.getParcelable(com.example.vit.popularmovies.ui.fragment.MoviesGridFragment.KEY_MOVIES_LIST));
            adapter.setData(moviesList);
        }
    }
    android.util.Log.d(MovieApplication.TAG, (((com.example.vit.popularmovies.ui.fragment.MoviesGridFragment.CLASS) + "movieList size = ") + (moviesList.size())));
}