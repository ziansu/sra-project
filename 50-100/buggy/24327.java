public void bind(final com.example.karan.popularmovies.Movie movie, final com.example.karan.popularmovies.OnPosterClickListener onPosterClickListener) {
    movieName.setText(movie.getTitle());
    com.squareup.picasso.Picasso.with(context).load(movie.getMoviePosterURL()).resizeDimen(R.dimen.activity_discover_poster_width, R.dimen.activity_discover_poster_height).into(moviePoster);
    itemView.setOnClickListener(new android.view.View.OnClickListener() {
        @java.lang.Override
        public void onClick(android.view.View v) {
            onPosterClickListener.onPosterClick(movie);
        }
    });
}