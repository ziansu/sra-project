public void onBindViewHolder(com.example.android.windsordesignstudio.movieviewr.MovieFavoritesAdapter.MovieFavoritesAdapterViewHolder holder, int position) {
    if (!(mCursor.moveToPosition(position)))
        return ;
    
    android.content.Context context = holder.mMoviePoster.getContext();
    java.lang.String moviePoster = mCursor.getString(mCursor.getColumnIndex(FavoritesContract.FavoriteEntry.COLUMN_POSTER_FULL_PATH));
    android.widget.ImageView poster = holder.mMoviePoster;
    com.squareup.picasso.Picasso.with(mContext).load(moviePoster).resize(600, 900).into(poster);
}