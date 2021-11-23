public void stop() {
    if (this.server.isServing()) {
        this.server.stop();
    }
}