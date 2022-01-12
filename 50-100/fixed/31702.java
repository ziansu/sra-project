public void start() throws java.io.IOException {
    mServer = new java.net.ServerSocket(mPort);
    try {
        while (true) {
            java.net.Socket socket = mServer.accept();
            try {
                mFtpSocket = new FtpSocket(socket);
                mFtpSocket.welcome();
                mFtpSocket.receiveFile();
            } finally {
                mFtpSocket.close();
            }
        } 
    } finally {
    }
}