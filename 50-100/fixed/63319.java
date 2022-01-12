public rx.Observable<java.lang.String> refreshToken(final java.lang.String user, final java.lang.String password) {
    return rx.Observable.create(new rx.Observable.OnSubscribe() {
        @java.lang.Override
        public void call(java.lang.Object t) {
            rx.Subscriber<java.lang.String> mySubscriber = ((rx.Subscriber<java.lang.String>) (t));
            try {
                mySubscriber.onNext(tokenService.get(user, password));
                mySubscriber.onCompleted();
            } catch (java.lang.Exception e) {
                mySubscriber.onError(e);
            }
        }
    });
}