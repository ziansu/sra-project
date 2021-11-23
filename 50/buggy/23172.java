@java.lang.Override
public void onResume() {
    android.util.Log.e("mainActivityFragment", "onResume :: start");
    mMoviesAdapter.notifyDataSetChanged();
    super.onResume();
}