@java.lang.Override
public void onLoadMoreData(final int page, int totalItemsCount) {
    adapter.setLoadingData(true);
    fermatWorker = new com.bitdubai.fermat_android_api.ui.util.FermatWorker(getActivity(), this) {
        @java.lang.Override
        protected java.lang.Object doInBackground() throws java.lang.Exception {
            return getMoreDataAsync(FermatRefreshTypes.NEW, page);
        }
    };
    fermatWorker.execute();
}