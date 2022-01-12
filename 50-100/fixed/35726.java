private void load() {
    getSourceObservable().compose(bindUntilEvent(FragmentEvent.DESTROY)).doOnNext(mUserValidator::validateIntercept).finallyDo(this::finallyDo).observeOn(rx.android.schedulers.AndroidSchedulers.mainThread()).subscribe(this::onNext, this::onError);
}