private java.lang.String bytesToHex(byte[] bytes) {
    java.util.ArrayList result = new java.util.ArrayList();
    for (byte b : bytes)
        result.add(java.lang.Integer.toString(((b & 255) + 256), 16).substring(1));
    
    return result.toString();
}