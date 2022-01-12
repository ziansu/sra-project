private void addToQueue(java.lang.String instName, int modebit, int param) {
    int opcode = db.getOPCode(instName, modebit);
    addBytes(opcode);
    binaryInstructions[((i)++)] = opcode;
    binaryInstructions[((i)++)] = param;
}