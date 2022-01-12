public void start() {
    if ((mReplaySubject) == null) {
        mReplaySubject = rx.subjects.ReplaySubject.create();
        if (hasObservable()) {
            mRefReplaySubscription = new java.lang.ref.WeakReference(getObservable().subscribe(mReplaySubject));
        }else {
            throw new java.lang.RuntimeException("Can't run. First you must create RxRetainFragment with not null observer");
        }
        subscribeObserver();
    }
}