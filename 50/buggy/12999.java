@java.lang.Override
public final void onBindViewHolder(final com.henriquenfaria.popularmovies.ui.FavoriteMoviesRecyclerViewAdapter.ViewHolder holder, final int position) {
    final android.database.Cursor cursor = this.getItem(position);
    this.onBindViewHolder(holder, cursor);
}