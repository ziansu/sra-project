@java.lang.Override
public pw.phylame.commons.io.BufferedRandomAccessFile provide() throws java.lang.Exception {
    cache = java.io.File.createTempFile("_text_cache_", ".tmp");
    return new pw.phylame.commons.io.BufferedRandomAccessFile(cache, "rw");
}