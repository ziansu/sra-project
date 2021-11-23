public static com.dropbox.djinnix.DirectArray wrap(java.nio.ByteBuffer b) {
    com.dropbox.djinnix.DirectArray da = new com.dropbox.djinnix.DirectArray();
    if ((b != null) && (b.isDirect())) {
        da.mDirectByteBuffer = b;
    }
    return da;
}