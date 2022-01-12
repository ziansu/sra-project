@java.lang.Override
public void run() {
    if ((callback) != null) {
        callback.onStart(java.lang.Thread.currentThread());
    }
    com.lzh.easythread.Tools.resetThread(java.lang.Thread.currentThread(), name, callback);
    proxy.run();
    if ((callback) != null) {
        callback.onCompleted(java.lang.Thread.currentThread());
    }
}