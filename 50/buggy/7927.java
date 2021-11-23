@java.lang.Override
public void handleMessage(android.os.Message msg) {
    if ((mNetworkService) != null) {
        waiters.put(msg.what, msg);
        mNetworkService.downloadImage(msg.what);
    }else {
        synchronized(msg) {
            msg.notify();
        }
    }
}