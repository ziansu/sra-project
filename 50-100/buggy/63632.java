@java.lang.Override
public void onDialogPopularityClick(android.support.v4.app.DialogFragment dialogFragment) {
    com.example.mordowiciel.filmapp.Fragment.MainFragment mainFragment = ((com.example.mordowiciel.filmapp.Fragment.MainFragment) (getSupportFragmentManager().findFragmentById(R.id.container_main)));
    if (mainFragment.movieIsShown) {
        mainFragment.showPopularMovies();
        mainFragment.tvIsShown = false;
    }
    if (mainFragment.tvIsShown) {
        mainFragment.showPopularTv();
        mainFragment.movieIsShown = false;
    }
}