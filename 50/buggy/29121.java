public void onClientConnectionFail() {
    log("Client connection fail !");
    new android.os.Handler().postDelayed(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            if (mRunning) {
                clientConnect();
            }
        }
    }, 5000);
}