public static byte[] receive(java.io.DataInputStream is) throws java.lang.Exception {
    byte[] inputData = new byte[1024];
    is.read(inputData);
    return inputData;
}