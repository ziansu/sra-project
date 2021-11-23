@java.lang.Override
public void onStop() {
    super.onStop();
    android.util.Log.d(MovieApplication.TAG, ((com.example.vit.popularmovies.ui.fragment.MoviesGridFragment.CLASS) + "onStop()"));
    bus.unregister(this);
}