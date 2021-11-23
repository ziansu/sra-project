byte loadByte(int atAddress) {
    if ((0 <= atAddress) && (atAddress < (memory.length))) {
        return memory[atAddress];
    }else {
        errorHandler.throwDataAddressError(("0x" + (java.lang.Integer.toHexString(atAddress))));
        return -1;
    }
}