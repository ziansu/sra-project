private void restoreInstanceState(final android.os.Bundle state) {
    presenter.setMovieId(state.getInt(ua.meugen.android.popularmovies.ui.fragments.MovieDetailsFragment.PARAM_MOVIE_ID));
    listenerUUID = ua.meugen.android.popularmovies.ui.utils.BundleUtils.getUUID(state, ua.meugen.android.popularmovies.ui.fragments.MovieDetailsFragment.PARAM_LISTENER_UUID);
    ua.meugen.android.popularmovies.ui.helpers.ListenersCollector collector = ua.meugen.android.popularmovies.ui.helpers.ListenersCollector.from(getActivity());
    listenerUUID = collector.registerListener(listenerUUID, presenter);
}