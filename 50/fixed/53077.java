public void changeProtocol(byte protocol) {
    this.currentProtocol = protocol;
    resetAPDU(shortAPDU, null, null);
    resetAPDU(extendedAPDU, null, null);
}