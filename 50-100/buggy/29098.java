public void setZSP16(int value) {
    this.setZeroFlag((value == 0));
    this.setSignFlag(((value & (codeSupport.Z80.WORD_SIGN)) != 0));
    this.setPvFlag((((java.lang.Integer.bitCount(value)) % 2) == 0));
}