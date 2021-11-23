void start() throws java.lang.Exception {
    if (((mClientThread) == null) || (!(mClientThread.isRunning()))) {
        mClientThread = new com.zzzmode.appopsx.LocalServerManager.SyncClient();
        if (mClientThread.start(0, false)) {
            android.util.Log.e(com.zzzmode.appopsx.LocalServerManager.TAG, "start --> server alread start !!!!!");
        }else {
            startServer();
            mClientThread.start(0, true);
        }
    }
}