private void storeSecond() {
    if ((second) != 0L) {
        putOperation(org.joml.Sequence.OPCODE_STORE_SECOND);
        putArg(second);
        putArg(0L);
        secondInSync = true;
    }
}