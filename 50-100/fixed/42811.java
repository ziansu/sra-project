public void ADDLW(int k) {
    int result = (getWRegister()) + k;
    if (isCarry(getWRegister(), k)) {
        setSTATUSbitC(1);
    }
    if (isDigitCarry(getWRegister(), k)) {
        setSTATUSbitDC(1);
    }
    if (result == 0) {
        setSTATUSbitZ(1);
    }
    setWRegister(result);
}