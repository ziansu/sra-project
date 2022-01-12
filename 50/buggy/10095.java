@java.lang.Override
public io.reactivex.Observable apply(java.lang.Throwable throwable) {
    return io.reactivex.Observable.error(this.asRetrofitException(throwable));
}