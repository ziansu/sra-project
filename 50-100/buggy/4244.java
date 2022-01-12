@java.lang.Override
protected void onStartLoading() {
    super.onStartLoading();
    if (((((mEmitter) != null) && ((mSubscription) == null)) && (!(mIsCompleted))) && ((mError) == null)) {
        mSubscription = mObservable.subscribe(new LoaderSubscriber());
    }
}