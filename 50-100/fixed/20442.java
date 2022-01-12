private void pullTrendingAnthologyFromNetwork() {
    if ((mGetTrendingAnthologySubscription) != null) {
        mGetTrendingAnthologySubscription.unsubscribe();
        mGetTrendingAnthologySubscription = null;
    }
    mIsLoading = true;
    com.jparkie.givesmehope.presenters.TrendingPresenterImpl.mGetTrendingAnthologyObservable = mGMHService.getTrendingAnthology(mTrendingAnthology.getNextPageUrl()).subscribeOn(rx.schedulers.Schedulers.io()).observeOn(rx.android.schedulers.AndroidSchedulers.mainThread()).cache();
    mGetTrendingAnthologySubscription = com.jparkie.givesmehope.presenters.TrendingPresenterImpl.mGetTrendingAnthologyObservable.subscribe(mGetTrendingAnthologyObserver);
}