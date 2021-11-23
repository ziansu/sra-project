public static void cleanup() {
    java.util.Collection<java.io.Closeable> streams = nablarch.fw.web.ResponseBody.STREAM_HOLDER.get();
    for (java.io.Closeable stream : streams) {
        nablarch.core.util.FileUtil.closeQuietly(stream);
    }
    java.util.Collection<java.io.File> tempFiles = nablarch.fw.web.ResponseBody.TEMP_FILE_HOLDER.get();
    for (java.io.File file : tempFiles) {
        if (!(file.delete())) {
            nablarch.fw.web.ResponseBody.LOGGER.logWarn(("could not delete a temporary file: " + (file.getAbsolutePath())));
        }
    }
    streams.clear();
    tempFiles.clear();
}