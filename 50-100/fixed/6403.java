private com.sun.jna.Pointer marshalToNative(java.lang.String value) {
    byte[] bytes = com.sun.jna.Native.toByteArray(value, "UTF-8");
    com.sun.jna.Pointer pointer = new com.sun.jna.Pointer(com.sun.jna.Native.malloc(bytes.length));
    pointer.write(0, bytes, 0, bytes.length);
    return pointer;
}