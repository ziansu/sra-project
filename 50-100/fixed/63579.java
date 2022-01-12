public void addTransaction(com.hulkdx.moneymanager.data.model.Transaction newTransaction) {
    checkViewAttached();
    com.hulkdx.moneymanager.util.RxUtil.unsubscribe(mSubscription);
    mSubscription = mDataManager.addTransaction(newTransaction).subscribeOn(rx.schedulers.Schedulers.io()).subscribe(new rx.Subscriber<com.hulkdx.moneymanager.data.model.Transaction>() {
        @java.lang.Override
        public void onCompleted() {
            timber.log.Timber.i("addTransaction onCompleted");
        }

        @java.lang.Override
        public void onError(java.lang.Throwable e) {
            timber.log.Timber.i("addTransaction onError");
        }

        @java.lang.Override
        public void onNext(com.hulkdx.moneymanager.data.model.Transaction transaction) {
            timber.log.Timber.e("addTransaction onNext");
        }
    });
}