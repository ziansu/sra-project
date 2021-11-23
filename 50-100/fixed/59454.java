private void JSR(int operand) {
    accessMemory((256 | ((s)--)), ((pc) >> 8));
    accessMemory((256 | ((s)--)), ((pc) & 255));
    pc = operand;
}