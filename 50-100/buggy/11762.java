private void updateParityFlag() {
    boolean parity = false;
    for (byte b = this.state.sfrs.A.getValue(); b > 0; b = ((byte) (b & (b - 1))))
        parity = !parity;
    
    this.state.sfrs.PSW.setBit(parity, 0);
}