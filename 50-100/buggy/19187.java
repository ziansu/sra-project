@java.lang.Override
public T call() throws java.lang.Exception {
    if ((callback) != null) {
        callback.onStart(java.lang.Thread.currentThread());
    }
    com.lzh.easythread.Tools.resetThread(java.lang.Thread.currentThread(), name, callback);
    T t = proxy.call();
    if ((callback) != null) {
        callback.onCompleted(java.lang.Thread.currentThread());
    }
    return t;
}