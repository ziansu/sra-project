public void run() {
    try {
        gH.initializationSequence(client);
        gH.clientLoop(client);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}