public boolean open() {
    setOpened(false);
    boolean ok = listener.open();
    if (ok) {
        setOpened(true);
    }
    return ok;
}