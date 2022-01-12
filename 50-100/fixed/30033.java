@java.lang.Override
public io.reactivex.Single<java.lang.Boolean> checkInternetConnectivity(final java.lang.String host, final int port, final int timeoutInMs, final com.github.pwittchen.reactivenetwork.library.rx2.internet.observing.error.ErrorHandler errorHandler) {
    checkGeneralPreconditions(host, port, timeoutInMs, errorHandler);
    return io.reactivex.Single.create(new io.reactivex.SingleOnSubscribe<java.lang.Boolean>() {
        @java.lang.Override
        public void subscribe(@io.reactivex.annotations.NonNull
        io.reactivex.SingleEmitter<java.lang.Boolean> emitter) throws java.lang.Exception {
            emitter.onSuccess(isConnected(host, port, timeoutInMs, errorHandler));
        }
    });
}