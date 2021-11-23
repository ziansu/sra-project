private java.lang.String bytesToHex(byte[] bytes) {
    java.lang.StringBuffer result = new java.lang.StringBuffer();
    for (byte b : bytes)
        result.append(java.lang.Integer.toString(((b & 255) + 256), 16).substring(1));
    
    return result.toString();
}