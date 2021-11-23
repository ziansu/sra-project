void storeByte(int atAddress, byte value) {
    if (atAddress < (memory.length)) {
        memory[atAddress] = value;
    }else {
        errorHandler.throwDataAddressError(("0x" + (java.lang.Integer.toHexString(atAddress))));
    }
}