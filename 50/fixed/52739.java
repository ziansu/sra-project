public void stop() {
    if (((this.server) != null) && (this.server.isServing())) {
        this.server.stop();
    }
}