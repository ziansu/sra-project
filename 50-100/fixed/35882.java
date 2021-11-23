private void pullVoteStoryFromNetwork() {
    if ((mGetVoteStorySubscription) != null) {
        mGetVoteStorySubscription.unsubscribe();
        mGetVoteStorySubscription = null;
    }
    com.jparkie.givesmehope.presenters.VotePresenterImpl.mGetVoteStoryObservable = mGMHService.getVoteStory(ApiModule.VOTE_URL).subscribeOn(rx.schedulers.Schedulers.io()).observeOn(rx.android.schedulers.AndroidSchedulers.mainThread()).cache();
    mGetVoteStorySubscription = com.jparkie.givesmehope.presenters.VotePresenterImpl.mGetVoteStoryObservable.subscribe(mGetVoteStoryObserver);
}