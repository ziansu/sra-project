public boolean isRunning() {
    for (java.lang.Thread t : threads) {
        if (t.isAlive()) {
            return true;
        }
    }
    return false;
}