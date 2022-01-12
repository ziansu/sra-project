protected void closeAllFileObjects() {
    for (java.nio.channels.FileChannel fo : openFiles.values()) {
        try {
            fo.close();
        } catch (java.io.IOException x) {
            com.shesse.h2ha.ServerSideProtocolInstance.log.debug("error when trying to close a FileObject", x);
        }
    }
    openFiles.clear();
}