@com.fernandocejas.frodo.annotation.RxLogObservable
private rx.Observable<rx.schedulers.Timestamped<java.util.List<com.murki.flckrdr.viewmodel.FlickrCardVM>>> obtainUsableObservable() {
    rx.Observable<rx.schedulers.Timestamped<java.util.List<com.murki.flckrdr.viewmodel.FlickrCardVM>>> recentPhotosObservable = ObservableSingletonManager.INSTANCE.getObservable(ObservableSingletonManager.FLICKR_GET_RECENT_PHOTOS);
    if (recentPhotosObservable == null) {
        com.murki.flckrdr.repository.FlickrDomainService flickrDomainService = new com.murki.flckrdr.repository.FlickrDomainService(getContext());
        recentPhotosObservable = flickrDomainService.getRecentPhotos(this).cache().observeOn(rx.android.schedulers.AndroidSchedulers.mainThread());
        ObservableSingletonManager.INSTANCE.putObservable(ObservableSingletonManager.FLICKR_GET_RECENT_PHOTOS, recentPhotosObservable);
    }
    return recentPhotosObservable;
}