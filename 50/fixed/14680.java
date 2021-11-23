@java.lang.Override
public void onFailed(java.lang.Exception e) {
    if (null != callback) {
        callback.onFailed(e);
    }
}