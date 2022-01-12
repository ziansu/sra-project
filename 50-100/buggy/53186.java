public void disconnectKeys(Key key1, Key key2) {
    if (key1.connections.contains(key2)) {
        key1.connections.remove(key2);
    }
    if (key2.connections.contains(key1)) {
        key2.connections.remove(key1);
    }
    KeyShapes.KeyLine found_keyline = keyshapes.connectionExists(key1, key2);
    if (found_keyline != null) {
        keyshapes.keylines.remove(found_keyline);
    }
}