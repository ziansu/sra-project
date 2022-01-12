public void break_loop() {
    super.break_loop();
    try {
        if ((mSender) != null) {
            mSender.shutdown();
        }
        if ((mSocket) != null) {
            if (!(mSocket.isClosed())) {
                mSocket.close();
            }
        }
        mSocket = null;
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}