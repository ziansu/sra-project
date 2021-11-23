public void updateSrcPort(int srcPort) {
    this.srcPort = srcPort;
    data[0] = ((byte) (srcPort & 255));
    data[1] = ((byte) ((srcPort & 255) >> 8));
}