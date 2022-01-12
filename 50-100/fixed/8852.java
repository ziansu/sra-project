public final void execute(final rx.functions.Action1<? super Result> onNext, final rx.functions.Action1<java.lang.Throwable> onError, Param param) {
    viper.Interactor.checkNotNull(onNext, "onNext");
    viper.Interactor.checkNotNull(onError, "onError");
    execute(new rx.Subscriber<Result>() {
        @java.lang.Override
        public void onCompleted() {
        }

        @java.lang.Override
        public void onError(final java.lang.Throwable e) {
            onError.call(e);
        }

        @java.lang.Override
        public void onNext(final Result result) {
            onNext.call(result);
        }
    }, param);
}