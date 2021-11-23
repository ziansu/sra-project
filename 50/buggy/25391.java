@java.lang.Override
public int read(long filePos, @javax.annotation.Nonnull
java.nio.ByteBuffer buf) throws java.io.IOException {
    int bytes = super.read(filePos, buf);
    this.curPos += bytes;
    return bytes;
}