private byte[] feistelFunction(byte[] key, byte[] right) {
    byte[] feisted = getXORKey(right, key);
    return feisted;
}