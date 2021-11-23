public void onResume() {
    if (!(didShowLoadingState)) {
        maximFeed.showLoadingState();
        didShowLoadingState = true;
    }
    maximManager.loadMaxims(context, new com.tcolligan.maximmaker.data.MaximManager.MaximsLoadedListener() {
        @java.lang.Override
        public void onMaximsLoaded(java.util.List<com.tcolligan.maximmaker.data.Maxim> loadedMaximList) {
            if (loadedMaximList == null) {
                maximFeed.showLoadingError();
            }else
                if ((loadedMaximList.size()) == 0) {
                    maximFeed.showEmptyState();
                }else {
                    maximFeed.showMaxims(loadedMaximList);
                }
            
        }
    });
}