public boolean isLotteryEntry() {
    byte[] program = getProgram();
    if ((program.length) != 2)
        return false;
    
    boolean hasEqual = ((program[0]) & 255) == (OP_EQUAL);
    boolean hasBeacon = ((program[1]) & 255) == (OP_BEACON);
    return hasEqual && hasBeacon;
}