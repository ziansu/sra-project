public void deleteLine() {
    text.removeLast();
    dirty = true;
    fireDataChanged();
}