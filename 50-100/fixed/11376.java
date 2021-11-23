public long getMemoryAddress(com.zms.zpc.emulator.PC pc) {
    assert (addressReg) == null;
    addressUseReg = false;
    long address = calAddress(pc, this.address);
    if (addressUseReg) {
        address += com.zms.zpc.execute.NumberUtils.asSigned(this.disp, this.dispWidth);
    }else {
        address += this.disp;
    }
    return getMemoryAddress(pc, address);
}