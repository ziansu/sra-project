int getpair(int reg) {
    if (reg == 3) {
        return SP;
    }
    int index = reg * 2;
    return ((regs[index]) << 8) | (regs[(index + 1)]);
}