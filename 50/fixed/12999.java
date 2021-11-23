@java.lang.Override
public final void onBindViewHolder(final com.henriquenfaria.popularmovies.ui.FavoriteMoviesRecyclerViewAdapter.ViewHolder holder, final int position) {
    final android.database.Cursor cursor = getItem(position);
    onBindViewHolder(holder, cursor);
}