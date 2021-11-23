public static byte[] receive(java.io.DataInputStream is) throws java.lang.Exception {
    try {
        byte[] inputData = new byte[1024];
        is.read(inputData);
        return inputData;
    } catch (java.lang.Exception exception) {
        throw exception;
    }
}