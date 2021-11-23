public java.util.Optional<okio.ByteString> open(okio.ByteString ciphertext, okio.ByteString data) {
    if ((ciphertext.size()) < 12) {
        return java.util.Optional.empty();
    }
    return open(ciphertext.substring(0, 12), ciphertext.substring(12), data);
}