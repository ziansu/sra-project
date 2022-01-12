protected void callNear_(long offset) {
    com.zms.zpc.execute.BaseReg rip = pc.cpu.regs.rip;
    executor.reLoc(input);
    long from = rip.getValue();
    push_(rip.getValue(), getOpWidth());
    long to = (rip.getValue()) + offset;
    pc.getDebugger().onMessage(com.zms.zpc.execute.DEBUG, "Call Near from %H to %H\n", from, to);
    rip.setValue(to);
    executor.ins = Call;
}