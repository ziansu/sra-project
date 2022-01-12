private byte[] removeId(byte[] payload) {
    byte[] array = new byte[(payload.length) - 1];
    for (int i = 0; i < (array.length); i++) {
        array[i] = payload[(i + 1)];
    }
    return array;
}