public final void shutDown() {
    if (processAlive) {
        writeLineToProcess("quit");
        processAlive = false;
    }
}