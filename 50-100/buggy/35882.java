private void pullVoteStoryFromNetwork() {
    if ((mGetVoteStorySubscription) != null) {
        mGetVoteStorySubscription.unsubscribe();
        mGetVoteStorySubscription = null;
    }
    com.jparkie.givesmehope.presenters.VotePresenterImpl.mGetVoteStoryObservable = mGMHService.getVoteStory(ApiModule.VOTE_URL).subscribeOn(rx.schedulers.Schedulers.io()).observeOn(rx.android.schedulers.AndroidSchedulers.mainThread()).doOnTerminate(new rx.functions.Action0() {
        @java.lang.Override
        public void call() {
            com.jparkie.givesmehope.presenters.VotePresenterImpl.mGetVoteStoryObservable = null;
        }
    }).cache();
    mGetVoteStorySubscription = com.jparkie.givesmehope.presenters.VotePresenterImpl.mGetVoteStoryObservable.subscribe(mGetVoteStoryObserver);
}