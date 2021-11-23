public void flushWithoutMargin() {
    if ((valueWithMargin) != (value)) {
        valueWithMargin = value;
        flush(null);
    }
}