public synchronized void open() throws java.io.IOException {
    if ((this.state) == (com.microsoft.azure.iothub.transport.State.OPEN)) {
        return ;
    }
    this.connection = new com.microsoft.azure.iothub.transport.amqps.AmqpsIotHubConnection(this.config, this.useWebSockets);
    try {
        this.connection.open();
        this.connection.addListener(this);
    } catch (java.lang.Exception e) {
        throw new java.io.IOException(e);
    }
    this.state = com.microsoft.azure.iothub.transport.State.OPEN;
}