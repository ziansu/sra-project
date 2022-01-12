public void close() {
    if ((this.state) != (com.microsoft.azure.iothub.transport.State.CLOSED)) {
        this.state = com.microsoft.azure.iothub.transport.State.CLOSED;
        this.sender.close();
        this.receiver.close();
        this.session.close();
        this.connection.close();
        this.reactorFuture.cancel(true);
        this.executorService.shutdown();
    }
}