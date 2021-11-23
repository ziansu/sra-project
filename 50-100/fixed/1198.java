@org.jetbrains.annotations.NotNull
protected java.io.InputStream getChunkInputStream(java.io.File appendFile, long offset, int pageSize) throws java.io.IOException {
    java.io.FileInputStream in = new java.io.FileInputStream(appendFile);
    if (offset > 0) {
        in.skip(offset);
    }
    return new java.io.BufferedInputStream(new com.intellij.util.io.LimitedInputStream(in, pageSize) {
        @java.lang.Override
        public int available() {
            return remainingLimit();
        }
    }, pageSize);
}