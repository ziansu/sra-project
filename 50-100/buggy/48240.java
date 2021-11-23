private byte[] listToArray(java.util.List<byte[]> list) {
    byte[] result = new byte[(list.size()) * 16];
    int i = 0;
    for (byte[] bytes : list) {
        for (byte elm : bytes) {
            result[i] = elm;
            i++;
        }
    }
    return result;
}