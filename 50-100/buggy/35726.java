private void load() {
    getSourceObservable().compose(bindUntilEvent(FragmentEvent.DESTROY)).observeOn(rx.android.schedulers.AndroidSchedulers.mainThread()).doOnNext(mUserValidator::validateIntercept).finallyDo(this::finallyDo).subscribe(this::onNext, this::onError);
}