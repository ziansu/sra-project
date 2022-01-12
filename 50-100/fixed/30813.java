private void ROR(int operand) {
    int t = (accessMemory(operand)) & 1;
    accessMemory(operand, (((accessMemory(operand)) >> 1) | ((c) << 7)));
    c = t;
    z = 0;
    if ((accessMemory(operand)) == 0) {
        z = 1;
    }
    n = (accessMemory(operand)) >> 7;
}