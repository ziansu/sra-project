private void clearRegisterBits(int reg, byte bits) throws jpigpio.PigpioException {
    byte regVal = readByteRegister(reg);
    byte newVal = regVal;
    newVal = ((byte) (newVal & (~bits)));
    writeByteRegister(reg, newVal);
}