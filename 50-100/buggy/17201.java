@java.lang.Override
public void onBindViewHolder(com.example.android.popularmovieapp.MoviesRecyclerViewAdapter.MovieViewHolder holder, int position) {
    if (null != (mMoviesData)) {
        com.example.android.popularmovieapp.MovieData curMovieData = mMoviesData[position];
        android.content.Context context = holder.mPosterImageView.getContext();
        holder.mLoadingIndicator.setVisibility(View.INVISIBLE);
        com.squareup.picasso.Picasso.with(context).load(curMovieData.getImageUrl().toString()).centerCrop().fit().into(holder.mPosterImageView);
    }else {
        holder.mLoadingIndicator.setVisibility(View.VISIBLE);
    }
}