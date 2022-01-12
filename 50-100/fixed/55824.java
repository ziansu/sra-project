public boolean isLotteryEntry() {
    byte[] program = getProgram();
    if ((program.length) != 2)
        return false;
    
    boolean hasBeacon = ((program[0]) & 255) == (OP_BEACON);
    boolean hasEqual = ((program[1]) & 255) == (OP_EQUAL);
    return hasEqual && hasBeacon;
}