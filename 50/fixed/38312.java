public boolean keyMayExist(final byte[] key, final java.lang.StringBuilder value) {
    return keyMayExist(nativeHandle_, key, 0, key.length, value);
}