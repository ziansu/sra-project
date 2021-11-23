public void run() {
    v9t9.common.asm.RawInstruction curInst = machine.getCpu().getCurrentInstruction();
    int bpPc = ((curInst.pc) + (curInst.getSize())) & 65535;
    machine.getExecutor().getBreakpoints().tempDisableBreakpoint(((curInst.pc) & 65535));
    v9t9.common.cpu.IBreakpoint bp = new v9t9.common.cpu.SimpleBreakpoint(bpPc, true);
    machine.getExecutor().getBreakpoints().addBreakpoint(bp);
    pauseMachine.setBoolean(false);
}