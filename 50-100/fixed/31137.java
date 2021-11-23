private void startServerLoader(android.os.Bundle bundle) {
    if (eu.javimar.popularmovies.Utils.isNetworkAvailable(this)) {
        if (eu.javimar.popularmovies.Utils.sConnectToApi) {
            setLoadingIndicatorVisible(true);
        }else {
            setLoadingIndicatorVisible(false);
        }
        getLoaderManager().initLoader(eu.javimar.popularmovies.MainActivity.MOVIE_SERVER_LOADER, bundle, this);
    }else {
        updateEmptyView();
    }
}