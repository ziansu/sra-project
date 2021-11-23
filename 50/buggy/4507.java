private void onDataLoaded(nich.work.aequorea.main.model.mainpage.Data data) {
    (mPage)++;
    setLoadingFinish();
    mBaseView.onDataLoaded(data.getData(), mBaseView.getModel().isRefreshing());
}