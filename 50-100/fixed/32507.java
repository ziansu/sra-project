private void setSourceForPlayer(java.util.List<java.lang.String> details) {
    m.nischal.melody.MediaPlayerService.mPlayer.reset();
    rx.Subscription sc = rx.Observable.just(details.get(0)).subscribeOn(rx.schedulers.Schedulers.io()).observeOn(rx.android.schedulers.AndroidSchedulers.mainThread()).subscribe(getPathObserver());
    subscriptions.add(sc);
}