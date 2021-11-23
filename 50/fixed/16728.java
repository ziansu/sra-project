private byte[] oneRoundEncrypt(byte[] left, byte[] right, byte[] key) {
    byte[] newRight = getXOR(feistelFunction(key, right), left);
    return newRight;
}