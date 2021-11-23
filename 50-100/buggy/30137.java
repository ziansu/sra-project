private void ROL(int operand) {
    c = (accessMemory(operand)) >> 7;
    accessMemory(operand, ((((accessMemory(operand)) << 1) | (c)) & 255));
    z = 0;
    if ((accessMemory(operand)) == 0) {
        z = 1;
    }
    n = (accessMemory(operand)) >> 7;
}