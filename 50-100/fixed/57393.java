@java.lang.Override
public void onError(java.lang.Throwable e) {
    running.remove(key);
    subscriptions.remove(key);
    data.remove(key);
    errors.put(key, e);
    si.dime.android.retainer.Bucket.DataHandler theHandler = handlers.get(key);
    if (theHandler != null) {
        theHandler.subscriber.onError(e);
    }
}