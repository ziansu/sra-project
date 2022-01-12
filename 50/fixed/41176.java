public boolean isBeginningInstruction() {
    if ((predecessors.size()) == 0) {
        return false;
    }
    return (predecessors.first().instructionIndex) == (-1);
}