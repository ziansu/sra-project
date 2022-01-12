private byte[] listToArray(java.util.List<byte[]> list, int size) {
    byte[] result = new byte[size];
    int i = 0;
    for (byte[] bytes : list) {
        for (byte elm : bytes) {
            if (i >= size)
                break;
            
            result[i] = elm;
            i++;
        }
    }
    return result;
}