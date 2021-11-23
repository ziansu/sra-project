private java.lang.String readStream() throws java.io.IOException {
    byte[] receipt = new byte[1024];
    java.lang.String result = "";
    sc.getInputStream().read(receipt);
    result += new java.lang.String(receipt, "UTF-8");
    return result;
}