public final void shutDown() {
    if (processAlive) {
        writeLineToProcess("quit", true);
        processAlive = false;
    }
}