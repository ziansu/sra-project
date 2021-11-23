public void exit() throws java.lang.InterruptedException {
    watchMojo.stop();
    java.lang.Thread.currentThread().interrupt();
    this.join();
}