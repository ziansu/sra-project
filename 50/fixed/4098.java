public void finalize() {
    try {
        this.communicationSocket.close();
    } catch (java.io.IOException e) {
        this.actController.handleException(new backend.exceptions.ServerException("Could not close server socket"));
    }
}