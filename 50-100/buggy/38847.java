public final void execute(final rx.functions.Action1<? super Result> onNext, Param param) {
    viper.Interactor.checkNotNull(onNext, "onNext");
    execute(new rx.Subscriber<Result>() {
        @java.lang.Override
        public void onCompleted() {
        }

        @java.lang.Override
        public void onError(final java.lang.Throwable e) {
            throw new rx.exceptions.OnErrorNotImplementedException(e);
        }

        @java.lang.Override
        public void onNext(final Result result) {
            onNext.call(result);
        }
    });
}