@java.lang.Override
public void onBindViewHolder(com.example.android.popularmovies.MovieAdapter.MovieAdapterViewHolder holder, int position) {
    java.lang.String posterPath = mPostersData[position];
    for (java.lang.String s : mPostersData) {
        android.util.Log.d(com.example.android.popularmovies.MovieAdapter.TAG, s);
    }
    java.lang.String posterURL = com.example.android.popularmovies.utilities.NetworkUtilities.imageURLBuilder(posterPath, NetworkUtilities.IMAGE_LARGE);
    android.util.Log.d(com.example.android.popularmovies.MovieAdapter.TAG, ("LOADING IMAGE " + posterURL));
    com.squareup.picasso.Picasso.with(ctx).load(posterURL).into(holder.mPosterView);
}