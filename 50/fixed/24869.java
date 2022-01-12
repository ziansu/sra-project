public void connectSoft() throws de.mickare.xserver.exceptions.NotInitializedException, java.io.IOException, java.lang.InterruptedException {
    if (!(this.isConnected())) {
        this.connect();
    }
}