@java.lang.Override
public void loadPictures() {
    io.reactivex.observables.ConnectableObservable<java.util.List<com.gemapps.rxpicapp.model.Picture>> connectible = getPicturesObservable();
    mPager.startPagination(connectible);
    mSubscription = connectible.observeOn(io.reactivex.android.schedulers.AndroidSchedulers.mainThread()).subscribeWith(listenForPictures());
    connectible.connect();
}