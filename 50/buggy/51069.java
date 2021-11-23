public void IORLW(int k) {
    int result = (getWRegister()) | k;
    if (result == 0) {
        setSTATUSbitZ(1);
    }
    setWRegister(result);
    throw new java.lang.UnsupportedOperationException("Not supported yet.");
}