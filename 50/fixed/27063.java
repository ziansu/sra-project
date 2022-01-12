public java.lang.String readString(int len) {
    byte[] bytes = readBytes(len);
    if (bytes != null)
        return new java.lang.String(bytes);
    
    return null;
}