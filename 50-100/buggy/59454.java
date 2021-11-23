private void JSR(int operand) {
    accessMemory((256 | ((s)--)), ((pc) & 255));
    accessMemory((256 | ((s)--)), ((pc) >> 8));
    pc = operand;
}