private io.reactivex.Observer<manoilo.catsapiandroidclient.model.Cat> getAllCatsObserver() {
    return new io.reactivex.Observer<manoilo.catsapiandroidclient.model.Cat>() {
        @java.lang.Override
        public void onSubscribe(io.reactivex.disposables.Disposable d) {
        }

        @java.lang.Override
        public void onNext(manoilo.catsapiandroidclient.model.Cat cat) {
            if (cat != null) {
                getCatImgUrl(cat);
                cats.add(cat);
            }
        }

        @java.lang.Override
        public void onError(java.lang.Throwable e) {
        }

        @java.lang.Override
        public void onComplete() {
            setCatRecyclerViewAdapter();
        }
    };
}