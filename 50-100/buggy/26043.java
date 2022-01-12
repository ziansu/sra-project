private void setR(int ordinal, byte newValue) {
    if ((ordinal < 0) || (ordinal > 7))
        throw new java.lang.IllegalArgumentException(("invalid R register ordinal: " + ordinal));
    
    int bank = ((this.state.sfrs.PSW.getValue()) >> 3) & 3;
    int address = (bank << 3) | ordinal;
    this.state.internalRAM.set(address, newValue);
}