@java.lang.Override
public void onError(java.lang.Throwable e) {
    removeSubscription(key);
    callBack.onError(e.getMessage());
}