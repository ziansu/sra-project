private void storeSecond() {
    putOperation(org.joml.Sequence.OPCODE_STORE_SECOND);
    putArg(second);
    putArg(0L);
    secondInSync = true;
}