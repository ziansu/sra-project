public void run() {
    v9t9.common.asm.RawInstruction curInst = machine.getCpu().getCurrentInstruction();
    int bpPc = (curInst.pc) + (curInst.getSize());
    machine.getExecutor().getBreakpoints().tempDisableBreakpoint(curInst.pc);
    v9t9.common.cpu.IBreakpoint bp = new v9t9.common.cpu.SimpleBreakpoint((bpPc & 65535), true);
    machine.getExecutor().getBreakpoints().addBreakpoint(bp);
    pauseMachine.setBoolean(false);
}