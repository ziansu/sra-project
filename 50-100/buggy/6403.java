private com.sun.jna.Pointer marshalToNative(java.lang.String value) {
    byte[] bytes = com.sun.jna.Native.toByteArray(value, "UTF-8");
    long nativeAddress = com.sun.jna.Native.malloc(bytes.length);
    com.sun.jna.Pointer pointer = new com.sun.jna.Pointer(nativeAddress);
    pointer.write(0, bytes, 0, bytes.length);
    pointer.setByte(bytes.length, ((byte) (0)));
    return pointer;
}