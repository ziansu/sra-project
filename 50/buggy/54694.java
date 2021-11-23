private void generateException(java.lang.String msg) {
    com.seek.biscuit.Utils.log(com.seek.biscuit.ImageCompressor.TAG, msg);
    java.lang.String path = sourcePath.path;
    exception = new com.seek.biscuit.CompressException(msg, path);
    dispatchError();
}