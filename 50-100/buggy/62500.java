@java.lang.Override
public void readFully(long pos, byte[] bytes) throws java.io.IOException {
    this.in.seek(pos);
    if ((this.in.getPos()) != pos) {
        throw new java.io.IOException(("Cannot find position : " + pos));
    }
    super.read(bytes, 0, bytes.length);
}