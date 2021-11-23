public void append(byte bw) throws java.io.IOException {
    this.write(bw, ((this.fileendpos) + 1));
}