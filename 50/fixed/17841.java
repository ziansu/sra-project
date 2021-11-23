public void shutdown() {
    if (((sslPtr) == (com.aolc.ssl.utils.SSLConstants.NULL_C_POINTER)) && ((fd) == (com.aolc.ssl.utils.SSLConstants.INVALID_FILE_DESCRIPTOR))) {
        return ;
    }
    synchronized(this) {
        sslShutdown();
        reset();
    }
}