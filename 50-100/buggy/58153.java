private void setDataSocket() throws java.lang.Exception {
    pasvSocket.setSoTimeout(0);
    if ((netMode) == (Statics.TRANSFER_MODE.PORT)) {
        dataSocket = new java.net.Socket(this.portHost, this.portPort);
    }else {
        if (((dataSocket) == null) || (dataSocket.isClosed())) {
            dataSocket = pasvSocket.accept();
        }
    }
}