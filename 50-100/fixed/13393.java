public void disconnect() {
    if ((!(this.started)) || ((this.controller) == null)) {
        return ;
    }
    try {
        this.controller.stop();
        uia.comm.SocketClient.logger.info(java.lang.String.format("%s> disconnect", this.aliasName));
    } catch (java.lang.Exception ex) {
    } finally {
        this.started = false;
        this.controller = null;
        this.ch = null;
        java.lang.System.gc();
    }
}