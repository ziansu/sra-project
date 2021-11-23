private java.lang.String readStream() throws java.io.IOException {
    byte[] receipt = new byte[1024];
    sc.getInputStream().read(receipt);
    java.lang.String result = new java.lang.String(receipt, "UTF-8");
    return result;
}