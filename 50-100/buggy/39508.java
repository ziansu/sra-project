private void clearUnusedNibble() {
    if (((nibbles_ptr.size()) % 2) == 1) {
        nibbles_ptr.set(((lengthOf().getInt()) / 2), ((byte) ((nibbles_ptr.get(((lengthOf().getInt()) / 2))) & 15)));
    }
}