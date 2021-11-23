public void simulate(com.nikonhacker.disassembly.tx.Statement statement, com.nikonhacker.disassembly.tx.StatementContext context) throws com.nikonhacker.emu.EmulationException {
    context.memory.store16(((context.cpuState.getReg(TxCPUState.SP)) + ((statement.imm) << 1)), ((context.cpuState.getReg(statement.rj_rt_ft)) & 65535));
    context.cpuState.pc += statement.getNumBytes();
}