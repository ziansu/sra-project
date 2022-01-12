private void processRequestResult(java.util.List<java.lang.Object> list, boolean isLoadMore) {
    if (!(requestParams.isComplete())) {
        processGirls(list);
        gankView.onSuccess(list, isLoadMore);
        getGankDayList(true);
    }else {
        requestParams.onComplete();
        if (com.fionera.base.util.Utils.notEmpty(list)) {
            processGirls(list);
            gankView.onSuccess(list, isLoadMore);
        }else {
            gankView.onError();
        }
    }
}