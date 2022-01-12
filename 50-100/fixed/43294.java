@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    android.util.Log.i(com.example.autotests.popularmoviesapp.MainActivity.TAG, "onSaveInstanceState was called");
    if ((mMoviesList) != null) {
        outState.putParcelableArrayList(com.example.autotests.popularmoviesapp.MainActivity.MOVIES, ((java.util.ArrayList<? extends android.os.Parcelable>) (mMoviesList)));
        outState.putString(com.example.autotests.popularmoviesapp.MainActivity.SORT_BY, com.example.autotests.popularmoviesapp.MainActivity.mSortBy);
        android.util.Log.d(com.example.autotests.popularmoviesapp.MainActivity.TAG, ("onSaveInstanceState -> Sort by: " + (com.example.autotests.popularmoviesapp.MainActivity.mSortBy)));
    }
    super.onSaveInstanceState(outState);
}