private byte[] getRoundKey(byte[] key, int round) {
    byte[] newKey = new byte[key.length];
    for (int i = 0; i < (key.length); i++) {
        newKey[i] = ((byte) ((key[i]) << round));
    }
    return newKey;
}