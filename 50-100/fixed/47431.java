@java.lang.Override
public void onActivityCreated(android.os.Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    if (savedInstanceState != null) {
        if (savedInstanceState.containsKey(com.example.vit.popularmovies.ui.fragment.MoviesGridFragment.KEY_MOVIES_LIST)) {
            moviesList = org.parceler.Parcels.unwrap(savedInstanceState.getParcelable(com.example.vit.popularmovies.ui.fragment.MoviesGridFragment.KEY_MOVIES_LIST));
            adapter.setData(moviesList);
        }
    }
}