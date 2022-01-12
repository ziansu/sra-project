public void deleteLine() {
    if (!(text.isEmpty())) {
        text.removeLast();
        dirty = true;
        fireDataChanged();
    }
}