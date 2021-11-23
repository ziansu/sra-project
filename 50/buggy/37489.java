@rx.Test(timeout = 1000, expected = rx.TestException.class)
public void toObservableError() {
    error.completable.toObservable().toBlocking().forEach(new rx.Action1<java.lang.Object>() {
        @java.lang.Override
        public void call(java.lang.Object e) {
        }
    });
}