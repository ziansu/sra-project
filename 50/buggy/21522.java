@java.lang.Override
public void onError(java.lang.Throwable e) {
    rx.Observable.just(e).subscribe(subscriber);
}