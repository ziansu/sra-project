int getpair(int reg) {
    switch (reg) {
        case 0 :
            return ((regs[net.sf.emustudio.intel8080.impl.EmulatorEngine.REG_B]) << 8) | (regs[net.sf.emustudio.intel8080.impl.EmulatorEngine.REG_C]);
        case 1 :
            return ((regs[net.sf.emustudio.intel8080.impl.EmulatorEngine.REG_D]) << 8) | (regs[net.sf.emustudio.intel8080.impl.EmulatorEngine.REG_E]);
        case 2 :
            return ((regs[net.sf.emustudio.intel8080.impl.EmulatorEngine.REG_H]) << 8) | (regs[net.sf.emustudio.intel8080.impl.EmulatorEngine.REG_L]);
        case 3 :
            return SP;
    }
    return 0;
}