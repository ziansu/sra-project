@java.lang.Override
public void clear() {
    for (com.wade.webserver.NanoHTTPD.TempFile file : this.tempFiles) {
        try {
            file.delete();
        } catch (java.lang.Exception ignored) {
            com.wade.webserver.NanoHTTPD.LOG.log(java.util.logging.Level.WARNING, "could not delete file ", ignored);
        }
    }
    this.tempFiles.clear();
}