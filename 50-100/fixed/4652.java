@java.lang.Override
public rx.Observable<?> call(java.lang.Throwable throwable) {
    if ((throwable instanceof java.lang.IllegalArgumentException) || (throwable instanceof java.lang.NullPointerException)) {
        return fakeApi.getFakeToken("fake_auth_code").doOnNext(new rx.functions.Action1<com.rengwuxian.rxjavasamples.model.FakeToken>() {
            @java.lang.Override
            public void call(com.rengwuxian.rxjavasamples.model.FakeToken fakeToken) {
                tokenUpdated = true;
                cachedFakeToken.token = fakeToken.token;
                cachedFakeToken.expired = fakeToken.expired;
            }
        });
    }
    return rx.Observable.error(throwable);
}