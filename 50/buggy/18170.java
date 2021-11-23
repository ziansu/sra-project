public static java.lang.String decrypt(java.lang.String data, java.lang.String key) {
    return Encryption.decrypt(Encryption.stringToIntArray(data), key);
}