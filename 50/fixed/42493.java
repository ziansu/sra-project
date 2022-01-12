@java.lang.Override
public void writeTo(final java.io.OutputStream outstream) throws java.io.IOException {
    if (outstream == null) {
        throw new java.lang.IllegalArgumentException("Output stream may not be null");
    }
    com.github.kubatatami.judonetworking.utils.FileUtils.copyStream(outstream, content, length);
}