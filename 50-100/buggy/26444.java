private int modeGUI() {
    while ((!(isReady)) && (!(java.lang.Thread.interrupted()))) {
        try {
            java.lang.Thread.sleep(100);
        } catch (java.lang.InterruptedException ex) {
            java.lang.Thread.currentThread().interrupt();
        }
    } 
    return nextMove;
}