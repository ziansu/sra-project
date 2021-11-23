public com.dropbox.djinnix.DirectArray wrap(java.nio.ByteBuffer b) {
    com.dropbox.djinnix.DirectArray da = new com.dropbox.djinnix.DirectArray();
    if (b.isDirect()) {
        da.mDirectByteBuffer = b;
    }
    return da;
}