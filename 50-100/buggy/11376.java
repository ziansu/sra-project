public long getMemoryAddress(com.zms.zpc.emulator.PC pc) {
    assert (addressReg) == null;
    addressUseReg = false;
    long address = calAddress(pc, this.address);
    if (addressUseReg) {
        address += com.zms.zpc.execute.NumberUtils.asSigned(this.disp, this.dispWidth);
    }else {
        address += this.disp;
    }
    com.zms.zpc.emulator.reg.Segment seg = ((com.zms.zpc.emulator.reg.Segment) (pc.cpu.regs.getReg(instru.segBase)));
    return seg.getAddress(address);
}