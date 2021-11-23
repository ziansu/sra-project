private void setDataSocket() throws java.lang.Exception {
    if ((pasvSocket) != null) {
        pasvSocket.setSoTimeout(0);
    }
    if ((netMode) == (Statics.TRANSFER_MODE.PORT)) {
        dataSocket = new java.net.Socket(this.portHost, this.portPort);
    }else {
        if (((dataSocket) == null) || (dataSocket.isClosed())) {
            dataSocket = pasvSocket.accept();
        }
    }
}