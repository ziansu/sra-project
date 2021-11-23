public void disconnectKeys(Key key1, Key key2) {
    if (key1.connections.contains(key2)) {
        key1.connections.remove(key2);
    }
    if (key2.connections.contains(key1)) {
        key2.connections.remove(key1);
    }
    keyshapes.disconnectKeys(key1, key2);
}