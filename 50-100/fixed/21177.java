@java.lang.Override
public bizartxo.udacity.nanodegree.androiddeveloper.popularmoviesapp.MovieAdapter.MovieViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    context = parent.getContext();
    int layoutIdForListItem = R.layout.movie_rv_item;
    android.view.LayoutInflater inflater = android.view.LayoutInflater.from(context);
    boolean shouldAttachToParentInmediately = false;
    android.view.View view = inflater.inflate(layoutIdForListItem, parent, shouldAttachToParentInmediately);
    bizartxo.udacity.nanodegree.androiddeveloper.popularmoviesapp.MovieAdapter.MovieViewHolder movieViewHolder = new bizartxo.udacity.nanodegree.androiddeveloper.popularmoviesapp.MovieAdapter.MovieViewHolder(view);
    return movieViewHolder;
}