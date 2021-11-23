private void pullTrendingAnthologyFromNetwork() {
    if ((mGetTrendingAnthologySubscription) != null) {
        mGetTrendingAnthologySubscription.unsubscribe();
        mGetTrendingAnthologySubscription = null;
    }
    mIsLoading = true;
    com.jparkie.givesmehope.presenters.TrendingPresenterImpl.mGetTrendingAnthologyObservable = mGMHService.getTrendingAnthology(mTrendingAnthology.getNextPageUrl()).subscribeOn(rx.schedulers.Schedulers.io()).observeOn(rx.android.schedulers.AndroidSchedulers.mainThread()).doOnTerminate(new rx.functions.Action0() {
        @java.lang.Override
        public void call() {
            com.jparkie.givesmehope.presenters.TrendingPresenterImpl.mGetTrendingAnthologyObservable = null;
        }
    }).cache();
    mGetTrendingAnthologySubscription = com.jparkie.givesmehope.presenters.TrendingPresenterImpl.mGetTrendingAnthologyObservable.subscribe(mGetTrendingAnthologyObserver);
}