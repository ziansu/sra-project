public void clear() {
    stopWatching(_before);
    stopWatching(_after);
    _before = null;
    _after = null;
}