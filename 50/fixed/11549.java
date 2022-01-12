private int fillbuf() throws java.io.IOException {
    super.seek(bufstartpos);
    bufdirty = false;
    return super.read(buf, 0, bufsize);
}