protected void connectSocket() {
    try {
        mSocket.connect();
    } catch (java.io.IOException e) {
        try {
            mSocket.close();
        } catch (java.io.IOException e2) {
            e2.printStackTrace();
        }
        return ;
    }
    mCommManager.setSocket(mSocket, false);
}