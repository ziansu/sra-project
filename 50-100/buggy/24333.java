@java.lang.Override
public void readFully(long pos, byte[] bytes, int off, int len) throws java.io.IOException {
    this.in.seek(pos);
    if ((this.in.getPos()) != pos) {
        throw new java.io.IOException(("Cannot find position : " + pos));
    }
    super.read(bytes, off, len);
}