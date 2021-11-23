private void close() {
    clearFlags();
    finish();
    closed = true;
}