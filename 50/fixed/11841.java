private void storeSecond(long addr) {
    if (addr != 0L) {
        putOperation(org.joml.Sequence.OPCODE_STORE_SECOND);
        putArg(addr);
        putArg(0L);
        if (addr == (second)) {
            secondInSync = true;
        }
    }
}