@java.lang.Override
public void handleMessage(android.os.Message msg) {
    int tag = msg.arg1;
    java.lang.Object object = msg.obj;
    com.paul.okhttpframework.okhttp.callback.IResultCallback iResultCallback = com.paul.okhttpframework.okhttp.manager.OkBD.getAndRemoveHashMap(tag);
    if (iResultCallback != null) {
        iResultCallback.onSuccessResult(object, tag);
    }
}