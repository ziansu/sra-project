@java.lang.Override
public void onError(java.lang.Throwable e) {
    rx.Observable.error(e).subscribe(subscriber);
}