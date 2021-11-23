@java.lang.Override
public void onFailed(java.lang.Exception e) {
    mContext.unregisterReceiver(mReceiver);
    if (null != callback) {
        callback.onFailed(e);
    }
}