@java.lang.Override
public void onMovieSelectListener(int position) {
    de.cineaste.android.network.TheMovieDb theMovieDb = new de.cineaste.android.network.TheMovieDb();
    theMovieDb.fetchMovie(getResult().get(position).getId(), getActivity().getResources().getString(R.string.language_tag), new de.cineaste.android.network.TheMovieDb.OnFetchMovieResultListener() {
        @java.lang.Override
        public void onFetchMovieResultListener(de.cineaste.android.entity.Movie movie) {
            de.cineaste.android.database.MovieDbHelper db = de.cineaste.android.database.MovieDbHelper.getInstance(getActivity());
            movie.setWatched(true);
            db.createOrUpdate(movie);
        }
    });
    getFragmentManager().popBackStack();
}