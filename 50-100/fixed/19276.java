public int popStack(int[] registers) {
    (registers[sos.CPU.SP])++;
    if (!(validMemory(((registers[sos.CPU.SP]) + (registers[sos.CPU.BASE])), registers))) {
        m_TH.interruptIllegalMemoryAccess(((registers[sos.CPU.SP]) + (registers[sos.CPU.BASE])));
    }
    return m_RAM.read(((registers[sos.CPU.SP]) + (registers[sos.CPU.BASE])));
}