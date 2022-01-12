private int modeGUI() {
    while (!(isReady)) {
        if (java.lang.Thread.interrupted()) {
            return -1;
        }
        try {
            java.lang.Thread.sleep(100);
        } catch (java.lang.InterruptedException ex) {
            java.lang.Thread.currentThread().interrupt();
        }
    } 
    return nextMove;
}