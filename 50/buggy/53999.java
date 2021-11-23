public void close() {
    if ((listener) != null) {
        listener.close();
        setOpened(false);
    }
}