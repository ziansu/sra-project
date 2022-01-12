private void subscribe() {
    if (((((mEmitter) != null) && ((mSubscription) == null)) && (!(mIsCompleted))) && ((mError) == null)) {
        mSubscription = mObservable.subscribe(new LoaderSubscriber());
    }
}