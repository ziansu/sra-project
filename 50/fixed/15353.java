private void cleanup() {
    try {
        this.table.close();
    } catch (java.io.IOException ignore) {
    }
}