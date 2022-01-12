public void start() throws java.io.IOException {
    mServer = new java.net.ServerSocket(mPort);
    try {
        while (true) {
            java.net.Socket socket = mServer.accept();
            if (((mFtpSocket) != null) && (mFtpSocket.isConnected())) {
                mFtpSocket.close();
            }
            mFtpSocket = new FtpSocket(socket);
            mFtpSocket.welcome();
            mFtpSocket.receiveFile();
        } 
    } finally {
    }
}