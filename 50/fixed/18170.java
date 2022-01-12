public static java.lang.String decrypt(java.lang.String data, java.lang.String key) {
    if ((data == null) || (data.isEmpty())) {
        return null;
    }
    return Encryption.decrypt(Encryption.stringToIntArray(data), key);
}