private void checkIfReady() {
    boolean allReady = true;
    for (boolean skillReady : skills.values()) {
        if (!skillReady) {
            allReady = false;
            break;
        }
    }
    this.ready = allReady;
}