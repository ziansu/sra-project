@java.lang.Override
public void seek(long pos) throws java.io.IOException {
    in.skip(pos);
    this.pos = pos;
}