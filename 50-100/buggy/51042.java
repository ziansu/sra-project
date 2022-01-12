@java.lang.Override
public void bindView(android.view.View view, android.content.Context context, android.database.Cursor cursor) {
    uk.co.danielmurphy.popularmovies.adapter.MovieAdapter.ViewHolder viewHolder = ((uk.co.danielmurphy.popularmovies.adapter.MovieAdapter.ViewHolder) (view.getTag()));
    com.squareup.picasso.Picasso.with(context).load(cursor.getString(MoviesFragment.COL_POSTER_PATH).trim()).placeholder(R.drawable.ic_sync_black_24dp).into(viewHolder.posterImageView);
}