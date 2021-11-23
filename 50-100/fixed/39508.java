private void clearUnusedNibble() {
    if (((nibbles_ptr.size()) % 2) == 1) {
        nibbles_ptr.set(((nibbles_ptr.size()) / 2), ((byte) ((nibbles_ptr.get(((nibbles_ptr.size()) / 2))) & 15)));
    }
}