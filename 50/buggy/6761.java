@java.lang.Override
public void onResume() {
    super.onResume();
    if ((com.myandroid.popularmovies.fragments.MainActivityFragment.state) != null) {
        android.util.Log.v(LOG_TAG, "state != null");
        gridView.onRestoreInstanceState(com.myandroid.popularmovies.fragments.MainActivityFragment.state);
    }
}