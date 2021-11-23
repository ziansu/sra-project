public void pushStack(int value, int[] registers) {
    if (!(validMemory(((m_registers[sos.CPU.SP]) + (registers[sos.CPU.BASE])), registers))) {
        m_TH.interruptIllegalMemoryAccess(((registers[sos.CPU.SP]) + (registers[sos.CPU.BASE])));
    }
    m_RAM.write(((registers[sos.CPU.SP]) + (registers[sos.CPU.BASE])), value);
    (registers[sos.CPU.SP])--;
}