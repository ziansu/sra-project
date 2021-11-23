@java.lang.Override
public void run() {
    try {
        mSocket = new java.net.Socket("117.34.105.157", 19527);
        mSocket.setKeepAlive(true);
        mSocket.setSoTimeout(0);
        mBufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(mSocket.getInputStream()));
        mOutputStream = mSocket.getOutputStream();
        startReadThread();
        writeDataToServer();
    } catch (java.net.SocketTimeoutException e) {
    } catch (java.io.IOException e) {
    }
}