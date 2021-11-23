private void requestToSearchNewGifs() {
    java.lang.System.out.println(((("awoooo | OnlineGifsPresenterImple | requestToSearchNewGifs | mIsGifsRequestRunning=" + (mIsGifsRequestRunning)) + "| isFirstSearchRequest = ") + (isFirstSearchRequest)));
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