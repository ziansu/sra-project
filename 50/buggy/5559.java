protected void finalize() {
    try {
        close();
    } catch (java.io.IOException e) {
    }
}