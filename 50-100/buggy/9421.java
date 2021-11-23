public void run() {
    while (true) {
        try {
            this.broker.receive();
            break;
        } catch (java.io.EOFException e) {
            handleConnectionException("Read data from client failed.", e);
        } catch (java.lang.Exception e) {
            handleConnectionException("Client connection failed.", e);
        }
    } 
}