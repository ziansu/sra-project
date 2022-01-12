@java.lang.Override
public void setTrailerRecyclerView() {
    mTrailerRecyclerView.setHasFixedSize(true);
    mTrailerRecyclerView.setLayoutManager(new android.support.v7.widget.LinearLayoutManager(getContext(), android.support.v7.widget.LinearLayoutManager.VERTICAL, false));
    if ((mMovieTrailerAdapter) == null) {
        mMovieTrailerAdapter = new silin.theMovieDB_2_0.screens.details.MovieTrailerAdapter(getContext(), new java.util.ArrayList<silin.theMovieDB_2_0.models.MovieTrailer>());
        mTrailerRecyclerView.setAdapter(mMovieTrailerAdapter);
    }
}