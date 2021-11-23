public void append(byte bw) throws java.io.IOException {
    this.write(bw, ((fileendpos) + 1));
}