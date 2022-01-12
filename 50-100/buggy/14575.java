public void createProcess(sos.Program prog, int allocSize) {
    final int base = 4;
    m_CPU.setBASE(base);
    m_CPU.setLIM((base + allocSize));
    m_CPU.setPC(base);
    int[] progArray = prog.export();
    for (int progAddr = 0; progAddr < (progArray.length); ++progAddr) {
        m_RAM.write((base + progAddr), progArray[progAddr]);
    }
    m_CPU.setSP(progArray.length);
}