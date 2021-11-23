void store(int atAddress, byte[] memoryBlock) {
    if ((atAddress + (memoryBlock.length)) <= (memory.length)) {
        java.lang.System.arraycopy(memoryBlock, 0, memory, atAddress, memoryBlock.length);
    }else {
        errorHandler.throwDataAddressError(java.lang.Integer.toHexString(atAddress));
    }
}