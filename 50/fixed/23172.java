@java.lang.Override
public void onResume() {
    android.util.Log.e("mainActivityFragment", "onResume :: start");
    super.onResume();
    mMoviesAdapter.notifyDataSetChanged();
}