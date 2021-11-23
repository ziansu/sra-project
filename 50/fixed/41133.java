private java.math.BigInteger encryptDecrypt(java.math.BigInteger key, java.math.BigInteger message) {
    return message.modPow(key, getN());
}