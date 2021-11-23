@java.lang.Override
public void onRestoreInstanceState(android.os.Bundle savedInstanceState) {
    if (savedInstanceState != null) {
        mRecyclerViewState = savedInstanceState.getParcelable(com.example.android.popularmovies.MainActivity.POSSITION_MOVIE_PREFERENCE);
        if ((mRecyclerView.getLayoutManager()) != null) {
            mRecyclerView.getLayoutManager().onRestoreInstanceState(mRecyclerViewState);
        }
    }
    mSharedPrefs.edit().putInt(com.example.android.popularmovies.MainActivity.SORT_MOVIE_PREFERENCE, savedInstanceState.getInt(com.example.android.popularmovies.MainActivity.SORT_MOVIE_PREFERENCE));
    super.onRestoreInstanceState(savedInstanceState);
}