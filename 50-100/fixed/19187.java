@java.lang.Override
public T call() throws java.lang.Exception {
    com.lzh.easythread.Tools.resetThread(java.lang.Thread.currentThread(), name, callback);
    if ((callback) != null) {
        callback.onStart(java.lang.Thread.currentThread());
    }
    T t = ((proxy) == null) ? null : proxy.call();
    if ((callback) != null) {
        callback.onCompleted(java.lang.Thread.currentThread());
    }
    return t;
}