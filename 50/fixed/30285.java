public void restart(org.fusesource.hawtbuf.Buffer buffer) {
    this.buf = buffer.getData();
    this.offset = buffer.getOffset();
    this.pos = this.offset;
    this.length = buffer.getLength();
}