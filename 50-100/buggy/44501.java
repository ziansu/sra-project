void putByte(int address, int b) {
    if (address > ((dataLength) - 1)) {
        userInterface.fatal(("Memory fault: address " + address));
    }
    data[address] = ((byte) (b & 255));
}