public void run() {
    while (true) {
        try {
            this.broker.receive();
        } catch (java.io.EOFException e) {
            handleConnectionException("Read data from client failed.", e);
            break;
        } catch (java.lang.Exception e) {
            handleConnectionException("Client connection failed.", e);
            break;
        }
    } 
}