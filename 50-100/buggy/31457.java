public static boolean listContainsArray(java.util.List<byte[]> list, byte[] array) {
    for (byte[] element : list) {
        if (!(java.util.Arrays.equals(element, array))) {
            return false;
        }
    }
    return true;
}