private void storeSecond(long addr) {
    putOperation(org.joml.Sequence.OPCODE_STORE_SECOND);
    putArg(addr);
    putArg(0L);
    if (addr == (second)) {
        secondInSync = true;
    }
}