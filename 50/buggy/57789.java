public void close() {
    try {
        timer.stop();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}