void putByte(int address, int b) {
    if ((address < 0) || (address > ((dataLength) - 1))) {
        userInterface.fatal(("Memory fault: address " + address));
    }else {
        data[address] = ((byte) (b & 255));
    }
}