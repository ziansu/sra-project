@java.lang.Override
public com.poissondumars.popularmovies.data.MoviesListAdapter.MoviesListAdapterViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    android.content.Context context = parent.getContext();
    android.view.LayoutInflater inflater = android.view.LayoutInflater.from(context);
    android.view.View view = inflater.inflate(R.layout.movie_grid_item, parent, false);
    return new com.poissondumars.popularmovies.data.MoviesListAdapter.MoviesListAdapterViewHolder(view);
}