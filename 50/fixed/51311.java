public void setRestoreItemClicked(int clickedPosition) {
    if (twoPane) {
        android.util.Log.v(LOG_TAG, "GOT HERE134");
        ((example.com.popularmovies.Main.MovieMainFragment.MovieMainListener) (context)).itemClicked(movieList.get(clickedPosition), clickedPosition, null);
    }
}