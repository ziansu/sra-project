byte loadByte(int atAddress) {
    if (atAddress < (memory.length)) {
        return memory[atAddress];
    }else {
        errorHandler.throwDataAddressError(("0x" + (java.lang.Integer.toHexString(atAddress))));
        return -1;
    }
}