public void reset() {
    count = 0;
    if ((buf) == null) {
        buf = new byte[initialSize];
    }
}