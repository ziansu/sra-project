private void requestToSearchNewGifs() {
    if (!(mIsGifsRequestRunning)) {
        if (!(isFirstSearchRequest)) {
            mView.showLoadingSnackbar();
        }
        mIsGifsRequestRunning = true;
        com.awoisoak.giphyviewer.utils.threading.ThreadPool.run(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                mServerInteractor.searchGifs(mView.getSearchText(), mOffset);
            }
        });
    }
}