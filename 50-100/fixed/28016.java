@java.lang.Override
public void run() {
    com.lzh.easythread.Tools.resetThread(java.lang.Thread.currentThread(), name, callback);
    if ((callback) != null) {
        callback.onStart(java.lang.Thread.currentThread());
    }
    if ((proxy) != null) {
        proxy.run();
    }
    if ((callback) != null) {
        callback.onCompleted(java.lang.Thread.currentThread());
    }
}