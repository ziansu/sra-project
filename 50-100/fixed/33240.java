@java.lang.Override
public void bindView(android.view.View view, android.content.Context context, android.database.Cursor cursor) {
    android.util.Log.d(me.zhaowenhao.popularmovies2.MovieAdapter.TAG, "bindView: started");
    me.zhaowenhao.popularmovies2.MovieAdapter.ViewHolder viewHolder = ((me.zhaowenhao.popularmovies2.MovieAdapter.ViewHolder) (view.getTag()));
    java.lang.String posterPath = (me.zhaowenhao.popularmovies2.MovieAdapter.MOVIE_POSTER_BASE_URL) + (cursor.getString(MainPageFragment.COLUMN_MOVIE_POSTER_PATH));
    android.util.Log.d(me.zhaowenhao.popularmovies2.MovieAdapter.TAG, ("bindView: " + posterPath));
    com.squareup.picasso.Picasso.with(mContext).load(posterPath).into(viewHolder.moviePosterView);
}