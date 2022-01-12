public void run() {
    try {
        handleKey(selectionKey);
    } catch (java.io.IOException ex) {
        selectionKey.cancel();
    }
}