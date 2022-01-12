protected void onIdle() throws java.lang.InterruptedException {
    if (!(this.isConnected())) {
        this.close();
        this.findServer();
    }
    java.util.Date now = new java.util.Date();
    if (((now.getTime()) - (this.lastACK.getTime())) > (com.homeCenter.cluster.Client.MAX_ACK_INTERVAL)) {
        this.close();
    }
}