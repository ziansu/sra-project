@java.lang.Override
public io.reactivex.ObservableSource<? extends java.lang.String> call() throws java.lang.Exception {
    android.os.SystemClock.sleep(500);
    return io.reactivex.Observable.just("test1", "test2", "test3");
}