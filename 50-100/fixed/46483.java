public void simulate(com.nikonhacker.disassembly.tx.Statement statement, com.nikonhacker.disassembly.tx.StatementContext context) throws com.nikonhacker.emu.EmulationException {
    context.cpuState.setReg(statement.rj_rt_ft, context.memory.loadUnsigned16(((context.cpuState.getReg(TxCPUState.FP)) + (((statement.imm) << 16) >> 16))));
    context.cpuState.pc += statement.getNumBytes();
}