public void rfs(BitWord immed) {
    R0.setBitValue(new BitWord(ArithmeticLogicUnit.padZeros(immed.getValue())));
    java.lang.String pc = R3.getBitValue().getValue().substring(4, 16);
    PC.setBitValue(pc);
}