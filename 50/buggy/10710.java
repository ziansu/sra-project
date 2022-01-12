public void stop() {
    this.connectionFactory.getConnection().discard();
    if ((this.container) != null) {
        this.container.stop();
    }
}