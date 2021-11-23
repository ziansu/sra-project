byte[] load(int atAddress, int length) {
    if ((0 <= atAddress) && ((atAddress + length) <= (memory.length))) {
        byte[] rv = new byte[length];
        java.lang.System.arraycopy(memory, atAddress, rv, 0, length);
        return rv;
    }else {
        errorHandler.throwDataAddressError(java.lang.Integer.toHexString(atAddress));
        return null;
    }
}