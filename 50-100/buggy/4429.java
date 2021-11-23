@java.lang.Override
public void loadListShotsByPage(int filterId, int page) {
    mShotsRepository.getListShotsByPage(page, filterId, new com.wang.dribbble.data.source.ShotsDataSource.LoadListShotsCallback() {
        @java.lang.Override
        public void onListShotsLoaded(java.util.List<com.wang.dribbble.data.model.Shots> shotsList) {
            mView.showListShotsFromPage(shotsList);
        }

        @java.lang.Override
        public void onDataNotAvailable() {
            mView.showLoadFailed("Load failed ...");
        }
    });
}