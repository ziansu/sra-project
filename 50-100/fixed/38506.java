@java.lang.Override
public void onLoadFinished(Loader<com.philosophicalhacker.lib.T> loader, com.philosophicalhacker.lib.T data) {
    final java.lang.Throwable error = ((com.philosophicalhacker.lib.ObservableLoader) (loader)).error;
    if (error != null) {
        e.onError(error);
    }else {
        e.onNext(data);
    }
}