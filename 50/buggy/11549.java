private int fillbuf() throws java.io.IOException {
    super.seek(this.bufstartpos);
    this.bufdirty = false;
    return super.read(this.buf, 0, this.bufsize);
}