public void start() throws java.io.IOException {
    if (!(isStarted)) {
        this.subscribe(subscribeTopic);
    }
}